package cn.itcast.io.p2.bean;

import java.io.Serializable;
/*
 * Serializable:用于给被序列化的类加入ID号。【id根据类的特性生成】
 * 用于判断类和对象是否是同一个版本。 
 * 对象往文件里面写，就是将对象序列化，因为，对象要按照顺序排列到文件当中。不是所有，对象放到treeset集合当中 ，必须要有比较功能
 * 
 * 【存储到硬盘上面是按照，字节存储，不要用记事本解析，记事本解析是，将字节查码表解码】
 */
public class Person implements Serializable/*标记接口*/ {//【该接口里面没有抽象方法，不要覆盖，只做标记用】

	/**
	 * transient:非静态数据不想被序列化可以使用这个关键字修饰。 
	 * 
	 * 编译器分版本，不同版本的编译器可能导致同一个类编译的  Id号不一样，进而导致，序列化的类对象读取不出来
	 */
	private static final long serialVersionUID = 9527l;//【通过自定义id，解决，反序列化id不一致的问题，就算改变person类中的特性，一样可以反序列化】
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
