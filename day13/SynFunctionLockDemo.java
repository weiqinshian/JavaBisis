

/*
同步函数的使用的锁是this；

同步函数和同步代码块的区别：
同步函数的锁是固定的this。

同步代码块的锁是任意的对象。

建议使用同步代码块。


*/
class Ticket implements Runnable
{
	private  int num = 100;
//	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
//		System.out.println("this:"+this);

		if(flag)
			while(true)
			{
				synchronized(this)//【如果，“synchronized(this)” 同步代码块 和 “synchronized void show()” 使用的不是同一个锁，那么，他们就可以同时运行。如果同时运行，那么就会出现这种情况
				                   // 同步代码块 和 同步函数 里面的语句 同时 对num 进行操作，这样就会出问题。  】
								   //如果，“synchronized(this)” 同步代码块 和 “synchronized void show()” 使用的同一个锁。那么，同一时刻，进入 同步代码块和同步函数的 线程只能有一个，这样就不会出现线程安全问题。
				{
					if(num>0)
					{
						try{Thread.sleep(10);}catch (InterruptedException e){}						
						System.out.println(Thread.currentThread().getName()+".....obj...."+num--);
					}
				}
			}
		else
			while(true)
				this.show();
	}

	public synchronized void show()
	{
		if(num>0)
		{
			try{Thread.sleep(10);}catch (InterruptedException e){}
			
			System.out.println(Thread.currentThread().getName()+".....function...."+num--);
		}
	}
}

class SynFunctionLockDemo 
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
//		System.out.println("t:"+t);

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t.flag = false;
		t2.start();
	}
}
