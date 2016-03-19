package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	/**
	 * 
	 * 【有个容器，里面装了元素，要把里面的元素取出来，先要拿到能够取出容器元素的对象。这个对象就是迭代器。】
	 * 
	 * 
	 * 
	 * 每种容器（集合）里面都有自己的数据结构。简单说就是 每种容器里面的数据的存储方式都有自己的特点。
	 * 迭代器，要依赖，容器内部数据的存储结构来实现。 迭代器是内部类。
	 * 
	 * 迭代器就是  实现了 iterator 接口的，每个容器 内部的对象。我们没有必要知道每个容器内部的实现方式。
	 * 
	 * 根据容器自身的特点定义取出方式。 接口，对外提供访问规则。【取玩具游戏】
	 * @param args
	 */
	public static void main(String[] args) {

		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
//		System.out.println(coll);【输出所有元素组成的字符串】
		
		//使用了Collection中的iterator()方法。 调用集合中的迭代器方法，是为了获取集合中的迭代器对象。
		Iterator it = coll.iterator();		
		while(it.hasNext()){
			System.out.println(it.next());
		}//【while 循环结束  it 还可以用，占用内存空间】
		
		for(Iterator it1 = coll.iterator(); it1.hasNext(); ){
			System.out.println(it1.next());
		}//【for循环结束  it 消失】
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//java.util.NoSuchElementException
		
	}

}







