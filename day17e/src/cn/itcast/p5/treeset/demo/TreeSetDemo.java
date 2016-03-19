package cn.itcast.p5.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p.bean.Person;
import cn.itcast.p5.comparator.ComparatorByName;

public class TreeSetDemo {

	/**
	 * ���Ƚ�������һЩ����Ϊ������㱾��߱��ȽϹ��ܣ��Ҳ�������ģ����밴���ҵķ�ʽ���ȣ��Ǿ�ֻ���ñȽ�����
	 * @param args
	 */
	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new ComparatorByName());//�Ƚ��� �ͣ�proson ���� �������Ȼ˳�� ͬʱ���� �Ƚ���Ϊ��
		
		/*
		 *
		 * ��Person����������д�С���������
		 * 
		 */
		
		ts.add(new Person("zhangsan",28));//��//��Person ��߱��ȽϹ��ܣ����Խ�������
		ts.add(new Person("lisi",21));//�ж�Ԫ��Ψһ�Եķ�ʽ�����Ǹ��ݱȽϷ����ķ��ؽ���Ƿ���0����0��������ͬԪ�أ����档 
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
