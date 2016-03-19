package cn.itcast.p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;

import cn.itcast.p.bean.Person;


/*
 * 往hashSet集合中存储Person对象。如果姓名和年龄相同，视为同一个人。视为相同元素。
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		HashSet hs = new HashSet();
		
		/*
		 * 因为通过算法得到存储地址，所以，无序！
		 * 
		 * HashSet集合数据结构是哈希表，所以存储元素的时候，
		 * 使用的元素的hashCode方法来确定位置，如果位置相同，在通过元素的equals来确定是否相同。
		 * 
		 */
		
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));//不从写object 的 hashCode 和equals 方法。调用 object类的方法
		
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p);
//			System.out.println(p.getName()+"...."+p.getAge());
		}
	}

}
