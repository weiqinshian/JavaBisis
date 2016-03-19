
/*
线程间通讯：
多个线程在处理同一资源，但是任务却不同。

比如，有一堆煤，有一个工人不断的加煤进来，有个工人，不断拉煤出去。多线程任务不一样。 
这和之前任务：四个人同时买票，两个人同时存钱。他们多个线程的任务是一样的。


*/

//资源【要唯一】
class Resource
{
	String name;
	String sex;
}


//输入 姓名年龄
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
		/*
	【写在外面的话，就是每次循环（注意是一次循环）是同步的，但是两次循环间可能不同步，这个时间可以去执行其他内容】
		*/
		{
			synchronized(r)
			{
				if(x==0)
				{
					r.name = "mike";//【如果，不加同步，线程可以在此出现阻塞，只有 姓名 被赋值（覆盖上次的赋值），而，性别还是上次赋值的性别。（性别没有被覆盖）】
					r.sex = "nan";
				}
				else
				{
					r.name = "丽丽";
					r.sex = "女女女女女女";
				}
			}
			x = (x+1)%2;//x值出现，0 、1 交替
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
		while(true)//不需要同步，因为，不操作公共字段
		{
			synchronized(r)//同步锁，如果，放在while 循环外面， 那么打印的结果将是单一的。 因为是，死循环，那么一直打印。线程没有出去过
			{
				System.out.println(r.name+"....."+r.sex);//一个cpu 时间片。这条语句会被执行多次。
			}
		}
	}
}



class  ResourceDemo
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
