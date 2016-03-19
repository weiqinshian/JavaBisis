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

		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());//��д������ʱ���Ҫ��ȷ����������Ҫװʲô����Ԫ�أ��ͺ���д����һ����
		ts.add(new Person("lisi8",21));
		ts.add(new Person("lisi3",23));//Ҫʵ�� �ӿ�comparable ������д ���󷽷�������ʵ�ֱȽϡ�
		ts.add(new Person("lisi",21));
		ts.add(new Person("lis0",20));
		
		Iterator<Person> it = ts.iterator();//���ӿ� Iterable <T> API�ĵ��� �м����ţ� ��Ӧ��Ҫд�����ǣ�Ϊ�˼���5.0 ��ǰ�İ汾����дҲ���ԡ�
		
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
