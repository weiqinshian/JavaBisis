package cn.itcast.p1.generic.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	/**
	 * �����������Ͳ�ȷ����ʱ�򣬲��÷��ͱ�ʾ���������治�ܶ�������������ͣ�{int}�� 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] arr = new int[4];
//		arr[0] = 3.0;
		
		
		ArrayList<String> al = new ArrayList<String>();//Ϊ�˱����Ժ���ְ�ȫ�������ڶ���������ʱ����ȷ������װʲô����Ԫ�ء��ͺ�������һ��
		
		al.add("abc");//public boolean add(Object obj)
		al.add("hahah");
//		al.add(4);//�ȼ���al.add(new Integer(4));  ǰ�� ��װ string ���ͣ�����װintger ���ͣ����Զ�����Ϊobject ���ͣ� ��Iterator ��String str = ��String��it.next().��ʱ�򱨴�intger����ת��Ϊstring
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			
			String str = it.next();//��Ϊ��Iterator<String>�����ԣ���Ҫǿת��String��
			System.out.println(str);
		}
	}

}



