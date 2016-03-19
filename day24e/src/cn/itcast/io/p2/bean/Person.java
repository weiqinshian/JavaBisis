package cn.itcast.io.p2.bean;

import java.io.Serializable;
/*
 * Serializable:���ڸ������л��������ID�š���id��������������ɡ�
 * �����ж���Ͷ����Ƿ���ͬһ���汾�� 
 * �������ļ�����д�����ǽ��������л�����Ϊ������Ҫ����˳�����е��ļ����С��������У�����ŵ�treeset���ϵ��� ������Ҫ�бȽϹ���
 * 
 * ���洢��Ӳ�������ǰ��գ��ֽڴ洢����Ҫ�ü��±����������±������ǣ����ֽڲ������롿
 */
public class Person implements Serializable/*��ǽӿ�*/ {//���ýӿ�����û�г��󷽷�����Ҫ���ǣ�ֻ������á�

	/**
	 * transient:�Ǿ�̬���ݲ��뱻���л�����ʹ������ؼ������Ρ� 
	 * 
	 * �������ְ汾����ͬ�汾�ı��������ܵ���ͬһ��������  Id�Ų�һ�����������£����л���������ȡ������
	 */
	private static final long serialVersionUID = 9527l;//��ͨ���Զ���id������������л�id��һ�µ����⣬����ı�person���е����ԣ�һ�����Է����л���
	private transient String name;
	private static int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
