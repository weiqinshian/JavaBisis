class Demo implements Runnable
{
	public void run()
	{
		for(int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread().toString()+"....."+x);
			Thread.yield();//释放线程cpu 执行权
		}
	}
}

class  JoinDemo
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();


		t2.start();
//		t2.setPriority(Thread.MAX_PRIORITY);//【优先级越大获取cpu执行权的几率越高】 静态常量


//		t1.join();//t1线程要申请加入进来，运行。临时加入一个线程运算时可以使用join方法。【主（其他）线程 释放执行权给t1线程，等待t1线程运行终止，再运行】

		for(int x=0; x<50; x++)
		{
//			System.out.println(Thread.currentThread()+"....."+x);
		}
	}
}
