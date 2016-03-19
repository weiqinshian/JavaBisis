package cn.itcast.p.bean;

public class Person /*extends Object*/ implements Comparable {//【实现Comparable接口 为了  实现  person 对象 可以进行比较，进而，可以进行排序】
//类的比较功能是扩展功能
	private String name;
	private int age;
	
	
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public int hashCode() {
//		System.out.println(this+".......hashCode");
		
		return name.hashCode()+age*27;
//		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		if(!(obj instanceof Person))//【健壮性判断】
			throw new ClassCastException("类型错误");
		
//		System.out.println(this+"....equals....."+obj);
		Person p = (Person)obj;
		
		
		
		return this.name.equals(p.name) && this.age == p.age;
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
	public String toString(){
		return name+":"+age;
	}
	@Override
	public int compareTo(Object o) {
		
		Person p = (Person)o;
		
		int  temp = this.age-p.age;
		return temp==0?this.name.compareTo(p.name):temp;//【String 类 也实现了 Comparable接口。对象要想进行比较 必须 实现Comparable】
		
//		int  temp = this.name.compareTo(p.name);
//		return temp==0?this.age-p.age:temp;
		
		/*
		if(this.age>p.age)
			return 1;
		if(this.age<p.age)
			return -1;	
		
		else{
			
			return this.name.compareTo(p.name);
		}
		*/
		
	}
	
}
