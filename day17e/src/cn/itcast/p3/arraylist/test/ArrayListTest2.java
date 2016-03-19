package cn.itcast.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

import cn.itcast.p.bean.Person;

/*
 * 定义功能去除ArrayList中的重复元素。
 */

public class ArrayListTest2 {

	/**
	 * 
	 * 
	 * 【无论是删除一个元素，还是包含一个元素是否存在，最终都要落实 在一个关键问题上，该元素是否有和该容器中的其他元素相同，
	 *   那就要看该容器判断相同的依据，对于ArrayList 这样的集合（容器）判断equals 方法。对于hashSet这样的集合 判断 hashcode 和equals
	 * 】
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		demo();
		
//		singleDemo();
		
		
		ArrayList al = new ArrayList();
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		System.out.println(al);
		
		al = getSingleElement(al);
		
		
		//System.out.println(al.remove(new Person("lisi2",22)));
		System.out.println(al);
		
		
		
		
	}

	/**
	 * 
	 */
	public static void singleDemo() {
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc2");
		al.add("abc1");
		al.add("abc");
		System.out.println(al);
		
		al = getSingleElement(al);
		
		System.out.println(al);
		
		
	}

	public static ArrayList getSingleElement(ArrayList al) {
		
		//1,定义一个临时容器。
		ArrayList temp = new ArrayList();
		
		//2,迭代al集合。
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			
			//3,判断被迭代到的元素是否在临时容器存在。
			if(!temp.contains(obj)){//【contains 方法内部 是 equals 实现,所以，通过重写equals方法，就可以自定义 方式来，判断集合里面的对象是否相等】
				temp.add(obj);
			}
		}
		
		return temp;
	}

	/**
	 * 
	 */
	public static void demo() {
		
//		al.add(5);//al.add(new Integer(5));
	}
	

}
