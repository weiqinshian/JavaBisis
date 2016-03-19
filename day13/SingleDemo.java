
/*
多线程下的单例

*/

//饿汉式
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;//只有一条语句不存在线程安全问题
	}
}
//懒汉式

加入同步为了解决多线程安全问题。

加入双重判断是为了解决效率问题。




class Single
{
	private static Single s = null;

	private Single(){}

	public static Single getInstance()
	{
		if(s==null)//【提高效率】,避免每次判断锁。解决效率问题
		{
			synchronized(Single.class)//【解决安全问题】
			{
				if(s==null)
		//				-->0 -->1 两个线程同时进入这里，new 出两个对象，会出现线程安全问题
					s = new Single();
			}
		}
		return s;
	}
}
class  SingleDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
