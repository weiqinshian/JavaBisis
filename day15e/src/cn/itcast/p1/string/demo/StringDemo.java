package cn.itcast.p1.string.demo;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*【从第15课开始讲，java 常用工具对象，故而要用到 编程工具。 包名p1 表示 package1 ，第一个包。】
		 * String类的特点：
		 * 字符串对象一旦被初始化就不会被改变。
		 * 
		 */
		stringDemo2();
	}

	public static void stringDemo2() {
		// TODO Auto-generated method stub
		
		String s = "abc";//创建一个字符串对象在常量池中。	【堆内存中创建一个常量池，来存放string 对象，这些对象是可以被共享的。】	
		String s1 = new String("abc");//创建两个对象一个new一个字符串对象在堆内存中。【堆内存当中用new的方式创建了一个string 对象，并没有在字符串常量池当中做任何事情。】
		//上面第一句话，在内存中创建一个对象。 第二句话，在内存中创建了两个对象。1、new String创建了一个对象。2、创建了实参“abc”对象，作为函数实参，这个对象要先存在。
		
		System.out.println(s==s1);//false  比较地址的时候，发现这两个地址不一样。
		
		System.out.println(s.equals(s1));//【重写之后，比较的是内容，而不是地址】
		//string类中的equals复写Object中的equals建立了string类自己的判断字符串对象是否相同的依据。
		//其实就是比较字符串内容。
		
		
//		System.out.println("s="+s);
//		System.out.println("s1="+s1);
		
	}

	/**
	 * 演示字符串定义的第一种方式，并明确字符串常量池的特点.
	 * 池中没有就建立，池中有，直接用。
	 */
	private static void stringDemo1() {
		String s = "abc";//"abc"存储在字符串常量池中。【也称为字符串缓冲区，创建之前首先在缓冲区中查看，是否有‘abc’】	
//		s = "nba";
		String s1 = "abc";		
		System.out.println(s==s1);//true? == 比较 对象的地址
//		System.out.println("s="+s);
	}

}
