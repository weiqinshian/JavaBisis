

wait 和 sleep 区别？

1，wait可以指定时间也可以不指定。
   sleep必须指定时间。

2，在同步中时，对cpu的执行权和锁的处理不同。
	wait：释放执行权，释放锁。【不能拿着锁等待，如果，不释放锁，不能对该锁进行 notifyAll】
	sleep:释放执行权，不释放锁。
【他们都可以让线程处于冻结状态，即释放执行权、执行资格】

【总之，同步里面，那个线程拿锁，那个线程执行】

class Demo
{

	void show()
	{
		synchronized(this)// 
		{
		 
			wait();//t0 t1 t2【notifyAll 执行之后，3个线程都活了， 都有执行权，等待执行资格。如果，cpu时间片 选中t0 ，那么t0也不一定执行，】
			                 //在同步中时，对cpu线程执行要持有锁。没有锁
		
		}
	}
	void method()
	{
		synchronized(this)//t4
		{
		
			//wait();

			notifyAll();
		
		
		}//【t4 这个线程执行完之后，才会释放锁，这时候，锁会被t0 t1 t2 其中一个持有，谁持有，谁执行】
	}
}




class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
