package cn.itcast.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	/**
	 * 
	 * ���и�����������װ��Ԫ�أ�Ҫ�������Ԫ��ȡ��������Ҫ�õ��ܹ�ȡ������Ԫ�صĶ������������ǵ���������
	 * 
	 * 
	 * 
	 * ÿ�����������ϣ����涼���Լ������ݽṹ����˵���� ÿ��������������ݵĴ洢��ʽ�����Լ����ص㡣
	 * ��������Ҫ�����������ڲ����ݵĴ洢�ṹ��ʵ�֡� ���������ڲ��ࡣ
	 * 
	 * ����������  ʵ���� iterator �ӿڵģ�ÿ������ �ڲ��Ķ�������û�б�Ҫ֪��ÿ�������ڲ���ʵ�ַ�ʽ��
	 * 
	 * ��������������ص㶨��ȡ����ʽ�� �ӿڣ������ṩ���ʹ��򡣡�ȡ�����Ϸ��
	 * @param args
	 */
	public static void main(String[] args) {

		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
//		System.out.println(coll);���������Ԫ����ɵ��ַ�����
		
		//ʹ����Collection�е�iterator()������ ���ü����еĵ�������������Ϊ�˻�ȡ�����еĵ���������
		Iterator it = coll.iterator();		
		while(it.hasNext()){
			System.out.println(it.next());
		}//��while ѭ������  it �������ã�ռ���ڴ�ռ䡿
		
		for(Iterator it1 = coll.iterator(); it1.hasNext(); ){
			System.out.println(it1.next());
		}//��forѭ������  it ��ʧ��
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//java.util.NoSuchElementException
		
	}

}







