package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	/**
	 * 单个数值用变量存储，数值有很多，用数组存。 数组有很多用二维数组存。
	 * 
	 * 数据有很多用对象存储。对象有很多用集合存储。
	 * 
	 * 集合本身也是个对象，是个能够存储对象的对象。
	 * 集合里面存储的是对象的地址。对象的地址按照什么规则排放？ 每种容器（集合）有自己的特点。
	 * 
	 * 集合为什么而存在？ 为了方便对对象进行操作，所以，首先 要对对象进行存储！
	 * 
	 * object 类型的数组也可以存地址。 但是，集合是可变长度的，数组是固定长度的。
	 * @param args
	 */
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
//		show(coll);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);
		
	}
	
	public static void show(Collection c1,Collection c2){
		
		//给c1添加元素。
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//给c2添加元素。
		c2.add("abc1");
		c2.add("abc2");
		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		//演示addAll
		
//		c1.addAll(c2);//将c2中的元素添加到c1中。
		
		
		//演示removeAll
//		boolean b = c1.removeAll(c2);//将两个集合中的相同元素从调用removeAll的集合中删除。
//		System.out.println("removeAll:"+b);
		
		//演示containsAll
//		boolean b = c1.containsAll(c2);
//		System.out.println("containsAll:"+b);
		
		//演示retainAll
		boolean b = c1.retainAll(c2);//取交集，保留和指定的集合相同的元素，而删除不同的元素。
								//和removeAll功能相反 。
		System.out.println("retainAll:"+b);
		System.out.println("c1:"+c1);
		
		
	}
	
	public static void show(Collection coll){
		
		//1,添加元素。add.
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		
		
		//2，删除元素。remove
//		coll.remove("abc2");//会改变集合的长度 
		
		//清空集合.
//		coll.clear();
		
		System.out.println(coll.contains("abc3"));
		
		
		System.out.println(coll);
		
	}

}
