/*
死锁：常见情景之一：同步的嵌套。
两个同步代码块，两种不同的锁，相互嵌套；
*/
class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag)
	{
		this.flag = flag;
	}
	public void run()
	{		
		if(flag)
		{
			while(true)//无限循环
				synchronized(MyLock.locka)
				{//线程执行该处 同步代码块，拿到了a 锁，准备拿 b 锁，但是，b锁被另外的线程拿到，还没有释放。
					System.out.println(Thread.currentThread().getName()+"..if   locka....");
					synchronized(MyLock.lockb)				{
						
						System.out.println(Thread.currentThread().getName()+"..if   lockb....");
					}
				}
		}
		else
		{
			while(true)			
				synchronized(MyLock.lockb)
				{//线程执行该处 同步代码块，拿到了b 锁，准备拿 a 锁，但是，a锁被另外的线程拿到，还没有释放。
					System.out.println(Thread.currentThread().getName()+"..else  lockb....");
					synchronized(MyLock.locka)
					{
						System.out.println(Thread.currentThread().getName()+"..else   locka....");
					}
				}
		}
	}
}
class MyLock
{
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}
class DeadLockTest 
{
	public static void main(String[] args) 
	{
		Test a = new Test(true);
		Test b = new Test(false);
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}
