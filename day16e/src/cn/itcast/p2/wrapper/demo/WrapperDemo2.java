package cn.itcast.p2.wrapper.demo;

public class WrapperDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 4;
		num = num + 5;//像操作 int 类型一样，操作 Integer 类型
		
		Integer i =  4;//1.5新特性，简化书写。相当于 Integer i = new Integer(4);（1.5 之前要这么写） 
		              //也称自动装箱(将整数4，装箱为对象，在后台运行)  目的：简化书写。
		i = i + 6;//  //  i = new Integer(i.intValue() + 6); //i.intValue() 自动拆箱
		            //【i要和6相加，i 必须要变成整数，对象不能相加，除非是字符串对象。】【把Integer 类型变成基本数据类型，用intValue 方法】
		            //i 在后台做了转化，称为自动拆箱。 但是，i 是对象，可以为 null。 所以，转化之前要做判断。
		
//		show(55);//
		
		
		Integer a = new Integer(128);
		Integer b = new Integer(128);
		
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		Integer x = 129;//jdk1.5以后，自动装箱，如果装箱的是一个字节（127以内），那么该数据会被共享不会重新开辟空间。【y 直接 指向x 地址。不会再新建一个y】
		Integer y = 129;
		System.out.println(x==y);//false【可变】
		System.out.println(x.equals(y));//true
		
		
	}
	
	public static void show(Object a){//Object a = new Integer(55);
		System.out.println("a="+a);
	}

}
