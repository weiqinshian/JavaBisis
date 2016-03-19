package cn.itcast.p1.string.demo;

public class StringObjectDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String s1 = "abc";
//		String s2 = "abc";
		
		//intern():对字符串池进行操作的 
		
		String s1 = new String("abc");//【传递进去“abc” ，看源代码，内部是把abc 变成 字符 数组在操作】
		String s2 = s1.intern();//等价于 String s2="abc";
		//当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（该对象由 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。
		System.out.println(s1==s2);
		
		
		
	}

}
