package cn.itcast.p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/**
	 * ����Ԫ��������ص㣬��ȡ����ŵ�λ�á�
	 * Ԫ�ظ���ô�ţ����Ԫ�ظ��ң���ͨ���㷨���ó�Ԫ�صĴ��λ�á�
	 * 
	 * �������Ҫ���� ��ϣ�� �Ƿ���Ԫ�� ab ����ô�������ţ�ab ��ͨ���㷨���Ϳ��Ե�֪�������������Ҫ��ȥ�������顣
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
