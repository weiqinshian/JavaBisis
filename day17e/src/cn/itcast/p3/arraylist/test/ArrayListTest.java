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
		al.add(new Person("lisi2",22));//��������������Ϊ��add��object obj����
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		
		Iterator it = al.iterator();
		while(it.hasNext()){
//			System.out.println(((Person) it.next()).getName()+"::"+((Person) it.next()).getAge());��.�� �����ȼ�����
			Person p = (Person) it.next();//����̬�ģ�����ת�ͣ�����ת�͡�
			System.out.println(p.getName()+"--"+p.getAge());
		}
//	��1.5 ������ôд��	al.add(5);//  1.4֮ǰֻ����ôд�� al.add(new Integer(5));����������ֻ��װ���� �������͸�ֵ����������ʱ���Զ�װ��
		//�������ͺ� ���������������ʱ���Զ�����
	}
	

}
