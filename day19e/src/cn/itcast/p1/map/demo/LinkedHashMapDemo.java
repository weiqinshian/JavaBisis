package cn.itcast.p1.map.demo;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	/**
	 * 
	 * һ������£������õ�������HashMap,��Map �в��롢ɾ���Ͷ�λԪ�أ�HashMap ����õ�ѡ�񡣵������Ҫ����Ȼ˳����Զ���˳�����������ôTreeMap����á�
	 * �����Ҫ�����˳����������ͬ,��ô��LinkedHashMap ����ʵ��,�������԰���ȡ˳��������.
		HashMap��һ����õ�Map�������ݼ���hashCodeֵ�洢���ݣ����ݼ�����ֱ�ӻ�ȡ����ֵ�����кܿ�ķ����ٶȡ�HashMap���ֻ����һ����¼�ļ�ΪNULL�����������¼��ֵΪNULL��
		HashMap��֧���߳�ͬ��������һʱ�̿����ж���߳�ͬʱдHashMap�����ܻᵼ�����ݵĲ�һ���ԡ������Ҫͬ����������Collections��synchronizedMap����ʹHashMap����ͬ����������
		Hashtable��HashMap���ƣ���ͬ���ǣ����������¼�ļ�����ֵΪ�գ���֧���̵߳�ͬ��������һʱ��ֻ��һ���߳���дHashtable�����Ҳ������Hashtable��д��ʱ��Ƚ�����
		LinkedHashMap�����˼�¼�Ĳ���˳������Iterator����LinkedHashMapʱ���ȵõ��ļ�¼�϶����Ȳ���ġ�
		�ڱ�����ʱ����HashMap��TreeMap�ܹ���������ļ�¼���ݼ�����Ĭ���ǰ���������Ҳ����ָ������ıȽ���������Iterator����TreeMapʱ���õ��ļ�¼���Ź���ġ�
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f= null;
		HashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		
		hm.put(7, "zhouqi");
		hm.put(3, "zhangsan");
		hm.put(1, "qianyi");
		hm.put(5, "wangwu");
		
		Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer,String> me = it.next();
			
			Integer key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key+":"+value);
		}
	}

}
