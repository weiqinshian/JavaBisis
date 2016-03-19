

/*
等待/唤醒机制。 【用处很普片】

涉及的方法：【使用以下这三个方法的时候必须要明确自己所属的锁。 下面三个都是操作锁上线程的方法】

1，wait(): 让线程处于冻结状态，【同时，线程释放执行权和执行资格】被wait的线程会被存储到线程池【池子，容器，用来装线程的容器】中。
2，notify():唤醒线程池中一个线程(任意).
3，notifyAll():唤醒线程池中的所有线程。【运行状态、临时阻塞状态，具备运行资格】

这些方法都必须定义在同步中。
因为这些方法是用于操作线程状态的方法。
必须要明确到底操作的是哪个锁上的线程。【一个程序里面可能有很多同步，有很多锁。要明确改变是哪个锁的线程。锁的特点是对多个线程进行同步】

【比如：这四个线程是属于我们这个锁的，是他们到我这里来运行的。我的锁里面的方法，对线程进行操作的时候，其他锁的方法不能对我锁里面的线程进行操作。】

为什么操作线程的方法wait notify notifyAll定义在了Object类中？ 

因为这些方法是监视器的方法。监视器其实就是锁。【监控线程的运行状态】
锁可以是任意的对象，任意的对象调用的方式一定定义在Object类中。

*/
//资源
class Resource
{
	String name;
	String sex;
	boolean flag = false;
}


//输入
class Input implements Runnable
{
	Resource r ;
//	Object obj = new Object();
	Input(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException e){}//r 锁 在调用wait 方法。线程一进来就进入了r锁。r锁里面的线程，被r锁里面的wait 方法 改变状态。 只能用r锁里面的nofify 方法来唤醒。 
				if(x==0)
				{
					r.name = "mike";
					r.sex = "nan";
				}
				else
				{
					r.name = "丽丽";
					r.sex = "女女女女女女";
				}
				r.flag = true;
				r.notify();// 可以多次被调用
			}
			x = (x+1)%2;

		}
	}
}
//输出
class Output implements Runnable
{

	Resource r;
//	Object obj = new Object();
	Output(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.flag)
					try{r.wait();}catch(InterruptedException e){}
				System.out.println(r.name+"....."+r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}



class  ResourceDemo2
{
	public static void main(String[] args) 
	{
		//创建资源。
		Resource r = new Resource();
		//创建任务。
		Input in = new Input(r);
		Output out = new Output(r);
		//创建线程，执行路径。
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//开启线程
		t1.start();
		t2.start();
	}
}
