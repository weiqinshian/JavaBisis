package cn.itcast.p1.otherapi;

import java.io.IOException;

public class RuntimeDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * 【任何程序运行都要依赖系统，windows系统会分配内存，分配地址空间，让你调用windows里面的所属的一部分资源。Runtime 实例不需要我们创建。】
		 * Runtime:没有构造方法摘要，说明该类不可以创建对象。【构造函数被私有化了】
		 * 又发现还有非静态的方法。说明该类应该提供静态的返回该类对象的方法。
		 * 而且只有一个，说明Runtime类使用了单例设计模式。【保证了运行时java 对象的唯一性】
		 * 
		 */
		
		Runtime r = Runtime.getRuntime();//【创建了一个运行时对象，该运行谁呢】
		
//		execute: 执行。 xxx.exe 
		
		Process p = r.exec("notepad.exe");//读本地文件，可能失败，所以，抛出异常【用java 程序开启硬盘上面的执行文件】
                                       //【notepad.exe  当前路径下面没有找到，到path 路径下去找】
		//【，Process 类是抽象的，没有子类，继承不了，对象无法创建。只有存在应用程序，才能去创建进程】
		
		//Process p = r.exec("notepad.exe c:\\RuntimeDemo.java");打开c盘下面的文件\ 是转义字符，所以，要用\\
		Thread.sleep(5000);
		p.destroy();
	}

}
