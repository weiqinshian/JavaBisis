package cn.itcast.p1.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p2.bean.Person;
import cn.itcast.p3.comparator.ComparatorByName;

public class GenericDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());//【写容器的时候就要明确，容器里面要装什么类型元素，就好像写数组一样】
		ts.add(new Person("lisi8",21));
		ts.add(new Person("lisi3",23));//要实现 接口comparable 。并重写 抽象方法，才能实现比较。
		ts.add(new Person("lisi",21));
		ts.add(new Person("lis0",20));
		
		Iterator<Person> it = ts.iterator();//【接口 Iterable <T> API文档中 有尖括号， 就应该要写，但是，为了兼容5.0 以前的版本。不写也可以】
		
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
