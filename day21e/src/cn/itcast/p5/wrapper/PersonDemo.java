package cn.itcast.p5.wrapper;

public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p = new Person();
//		p.chifan();
		
		NewPerson p1 = new NewPerson(p);//�����Ķ�ԭ���Ķ���װ�Σ����ʲ��䣬�ڲ�����Person����۱��ˣ�ʵ�ʲ��䡿
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2();
		p2.chifan();
	}

}

class Person{
	void chifan(){
		System.out.println("�Է�");//��Ҫ��ǿ���ܣ���Ҫ�޸ģ�ԭ���Ĵ��룬��Ϊ������Ҫ�Ķ��ܶ�ط�����
	}
}
//�����ĳ�����Ϊ����ǿPerson�����ֵġ�
class NewPerson{
	private Person p ;
	NewPerson(Person p){
		this.p = p;
	}
	
	public void chifan(){
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
		
	}

}

class NewPerson2 extends Person{//��������չ�����Ǽ̳С�
	public void chifan(){
		System.out.println("��θ��");
		super.chifan();
		System.out.println("���");
	}
}













