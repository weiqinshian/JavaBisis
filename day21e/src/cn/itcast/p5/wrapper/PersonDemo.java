package cn.itcast.p5.wrapper;

public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p = new Person();
//		p.chifan();
		
		NewPerson p1 = new NewPerson(p);//【不改动原来的对象。装饰，本质不变，内部基于Person。外观变了，实质不变】
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2();
		p2.chifan();
	}

}

class Person{
	void chifan(){
		System.out.println("吃饭");//【要增强功能，不要修改，原来的代码，因为，可能要改动很多地方。】
	}
}
//这个类的出现是为了增强Person而出现的。
class NewPerson{
	private Person p ;
	NewPerson(Person p){
		this.p = p;
	}
	
	public void chifan(){
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
		
	}

}

class NewPerson2 extends Person{//【当年扩展，就是继承】
	public void chifan(){
		System.out.println("开胃酒");
		super.chifan();
		System.out.println("甜点");
	}
}













