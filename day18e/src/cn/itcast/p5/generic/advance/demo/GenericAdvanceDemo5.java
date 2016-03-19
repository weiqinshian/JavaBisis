package cn.itcast.p5.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p2.bean.Person;
import cn.itcast.p2.bean.Student;
import cn.itcast.p2.bean.Worker;

public class GenericAdvanceDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Person> al1 = new ArrayList<Person>();
		
		al1.add(new Person("abc",30));
		al1.add(new Person("abc4",34));
		ArrayList<Person> al2 = new ArrayList<Person>();
		
		al2.add(new Person("abc22222",30));
		al2.add(new Person("abc42222222",34));
		
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("abcdeef");
		al4.add("abc");
		
		al1.containsAll(al4);//【al1 中 包含 a14 对象吗，containsAll 方法，内部用equals 方法实现，而该方法的参数是object类型，所以，可以传任何类型】
		
		
//		"abc".equals(new Person("ahahah",20));
		
		
		
		
	}
	public static void printCollection(Collection<?> al){
		Iterator<?> it = al.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next().toString());
		}
	}
}

class MyCollection2<E>{
	public boolean containsAll(Collection<?> coll){//当可以传任何类型的时候，既，参数对象是object类型的时候，当然可以用（也应该用）通配符？ ，来做参数
		
		
		return true;
	}
}
