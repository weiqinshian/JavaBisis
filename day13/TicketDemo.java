/*
需求：卖票。
*/

/*
线程安全问题产生的原因（下面两个条件同时满足）：

1，多个线程在操作共享的数据。（四个线程 操作一个num）

2，操作共享数据的线程代码有多条。【只有一条语句不存在安全问题，cpu 一次至少执行一条语句】

当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算。
就会导致线程安全问题的产生。 


解决思路；
就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，
其他线程时不可以参与运算的。
必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算。 

在java中，用同步代码块就可以解决这个问题。

同步代码块的格式：
synchronized(对象)
{
	需要被同步的代码 ；
}

同步的好处：解决了线程的安全问题。


同步的弊端：相对降低了效率，因为同步外的线程的都会判断同步锁。


同步的前提：同步中必须有多个线程并使用同一个锁。



*/

class Ticket implements Runnable//extends Thread
{
	private  int num = 100;

	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)//【为什么要加个对象？ obj对象 随着new Ticket() 创建 而在堆内存中创建，因为，定义在run函数外，所以会被每个线程（调用run方法的线程）共有。
			                                       //每个线程调用run方法执行到 synchronized(obj);语句时，都会判断这个对象（obj），是否被其他线程拿走了（是否被其他线程占有）。
												   //后面的线程来拿就拿不到（其实就是obj 的地址），保证了代码执行的唯一性】注意这个对象可以是任意类的对象，也可以使用this关键字
			{
				if(num>0)//【要是没有 这个判断，循环里面只有一个打印语句，也不会出线程安全问题。 正因为有多条语句，在语句执行直接，另外的线程出现的阻塞。而跳过了这个条件判断，导致，打印出现负数。】
				{
					try{Thread.sleep(10);}catch (InterruptedException e){} // 【为什么要在此捕捉异常。因为，调用 sleep 方法时，sleep 方法 抛出了 InterruptedException 异常，那么，我们有两种处理方式】
					                                                       /* 方式一： 在run() 方法上 抛出 InterruptedException 异常。 这种方法不可，为何？ 因为，run 方法是覆盖 Runnable接口的方法。而，
																		                Runnable 接口 中的run 方法，没有 throws  InterruptedException 异常。 如果，抛出。就覆盖不了这个方法。 
																			  方式二： 捕获异常。只有这种方法可行			
																		   */
					
					System.out.println(Thread.currentThread().getName()+".....sale...."+num--);
				}
			}
		}
	}
}


class  TicketDemo
{
	public static void main(String[] args) 
	{

		Ticket t = new Ticket();//创建一个线程任务对象。

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();


		/*
		Ticket t1 = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();

		t1.start();
		t1.start();//一个线程不能开启两次，会抛出无效线程状态异常 
		t1.start();
		t1.start();
		*/

		
	}
}

