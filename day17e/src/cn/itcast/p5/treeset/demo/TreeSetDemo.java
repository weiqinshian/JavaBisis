package cn.itcast.p5.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p.bean.Person;
import cn.itcast.p5.comparator.ComparatorByName;

public class TreeSetDemo {

	/**
	 * 【比较器常用一些，因为，如果你本身具备比较功能，我不想用你的，我想按照我的方式来比，那就只能用比较器】
	 * @param args
	 */
	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new ComparatorByName());//比较器 和，proson 类中 本身的自然顺序 同时存在 比较器为主
		
		/*
		 *
		 * 以Person对象年龄进行从小到大的排序。
		 * 
		 */
		
		ts.add(new Person("zhangsan",28));//【//让Person 类具备比较功能，可以进行排序】
		ts.add(new Person("lisi",21));//判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。 
		ts.add(new Person("zhouqi",29));
		ts.add(new Person("zhaoliu",25));
		ts.add(new Person("wangu",24));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			
			System.out.println(p.getName()+":"+p.getAge());
		}
	
	}



	/**
	 * 
	 */
	public static void demo1() {
		TreeSet ts = new TreeSet();
		
		ts.add("abc");
		ts.add("zaa");
		ts.add("aa");
		ts.add("nba");
		ts.add("cba");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
