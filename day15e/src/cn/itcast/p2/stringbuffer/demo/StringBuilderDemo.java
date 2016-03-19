package cn.itcast.p2.stringbuffer.demo;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*
		 * jdk1.5以后出现了功能和StringBuffer一模一样的对象。就是StringBuilder
		 * 
		 * 不同的是：
		 * StringBuffer是线程同步的。通常用于多线程。
		 * StringBuilder是线程不同步的。通常用于单线程。 它的出现提高效率。
		 * 
		 * jdk升级：
		 * 1，简化书写。【通常带来局限性】
		 * 2，提高效率。
		 * 3，增加安全性。【带来书写的麻烦】
		 * 
		 * 从 JDK 5 开始，为该类补充了一个单个线程使用的等价类，即 StringBuilder。与该类相比，
		 * 通常应该优先使用 StringBuilder 类，因为它支持所有相同的操作，但由于它不执行同步，所以速度更快。 【不需要判断锁】
		 * 
		 */
		
		
	}

}
/*
StringBuffer 的内部实现原理

class StringBuffer jdk1.0【首先考虑的是安全，其次考虑效率。创建一个StringBuilder 对象，一个线程在向里面添加，一个线程在向里面删除，这个时候就会出现安全隐患】
{
	object lock;
	public   StirngBuffer append(int x)//添加的时候不能删除，删除的时候不能添加。删除和添加要进行同步
	{
		synchronized(lock)
		{
		}
	}
	
	
	public synchronized StringBuffer delete(int start,int end)
	{
		synchronized(lock)
		{
		}
	}
}

【单线程 就用StringBuilder  多线程用  StringBuffer】








*/

