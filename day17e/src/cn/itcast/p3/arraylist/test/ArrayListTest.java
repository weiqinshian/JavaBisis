package cn.itcast.p3.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

import cn.itcast.p.bean.Person;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("lisi1",21);
		
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(new Person("lisi2",22));//【类型提升，因为，add（object obj）】
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		
		Iterator it = al.iterator();
		while(it.hasNext()){
//			System.out.println(((Person) it.next()).getName()+"::"+((Person) it.next()).getAge());“.” 的优先级问题
			Person p = (Person) it.next();//【多态的，向上转型，向下转型】
			System.out.println(p.getName()+"--"+p.getAge());
		}
//	【1.5 可以这么写】	al.add(5);//  1.4之前只能这么写： al.add(new Integer(5));【集合里面只能装对象】 基本类型赋值给引用类型时，自动装箱
		//引用类型和 基本类型做运算的时候，自动拆箱
	}
	

}
