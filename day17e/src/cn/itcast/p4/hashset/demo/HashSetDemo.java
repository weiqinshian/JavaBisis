package cn.itcast.p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/**
	 * 根据元素自身的特点，获取，存放的位置。
	 * 元素该怎么放，你把元素给我，我通过算法，得出元素的存放位置。
	 * 
	 * 如果，我要查找 哈希表 是否有元素 ab ，那么，我拿着，ab 再通过算法，就可以得知结果，而，不需要再去遍历数组。
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		hs.add("hehe");
//		hs.add("heihei");
		hs.add("hahah");
		hs.add("xixii");
		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
