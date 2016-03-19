/*
Object:������ĸ��ࡣ
Object�ǲ��ϳ�ȡ�������߱������ж��󶼾߱��Ĺ������ݡ�
���õĹ��Թ��ܣ�
*/
/*
class Fu // extends Object
{
	Fu()
	{
		super();
	}
}
class Zi extends Fu
{
	Zi()
	{
		super();
	}
}
*/

class Person extends Object
{
	private int age;
	Person(int age)
	{
		this.age = age;
	}
	/*
	//�Ƚ�Person�����䡣�Ƿ���ͬ����
	public boolean compare(Person p)
	{
		return this.age == p.age;	
	}
	*/

	/*
	һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ������ж϶����Ƿ���ͬ�����ݡ�
	equals��== һ�����ǱȽ϶���ĵ�ַ���鿴jdkԴ�� equals �����ڲ�Ҳ���� == ʵ�ֵ�
	�Ǽ�Ȼ���� == Ϊʲô�� Ҫequals �أ� �� Ϊ�� ���� ���� ���� equals ������
	��Ȼ��Ϊ�˸��ǣ�Ϊʲô object ���� equals ��������Ϊ���󷽷���  �����object������� equals ��������Ϊ���󷽷�����ô�������������ÿһ���඼Ҫ��д�ó��󷽷�������Ϊ������
	
	*/

	public boolean equals(Object obj)//Object obj = p2; ��д object ���е� equals ����
	{
		if(!(obj instanceof Person))
		{
//			return false;
			throw new ClassCastException("���ʹ���"); //��Ϊ������ʱ�쳣�����ԣ���equals �������治Ҫ����
		}
		Person p = (Person)obj;
		return this.age == p.age;
	}
/*
	public int hashCode()
	{
		return age;
	}
*/

	public String toString()//��д object �����е� toString �������ַ�����һ������ĸ�ʽ��java ��Ϊ���ж����� ת��Ϊ�ַ��� 
	{
		return "Person :"+age;
	}
}
class Demo
{
}


class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(60);
		Person p2 = new Person(20);
		Demo d = new Demo();
//		System.out.println(p1.equals(p2));

//		System.out.println(p1);
//		System.out.println(Integer.toHexString(p1.hashCode()));
			
/* java �����ʱ�򣬻Ὣÿһ�������Ϊ�ֽ����ļ��� ��Щ�ֽ����ļ��� ���ԡ� �Ǿ��ǣ�ÿ���ֽ����ļ����� ���ԡ������������������ֽ����ļ��������ϳ�ȡ ��Ϊһ���� Class��������ĸ��д��

*/
//		Class clazz1 = p1.getClass();//�õ�����P1�� �ֽ����ļ���
//		Class clazz2 = p2.getClass();
//		System.out.println(clazz1==clazz2);// true ����Ϊ��p1 �� p2 ������ Person�� �����Ķ������ԣ����� �ֽ����ļ���ͬһ����
//		System.out.println(clazz1.getName());

/*toString ���������ظö�����ַ�����ʾ��ͨ����toString �����᷵��һ�������ı���ʽ��ʾ���˶�����ַ��������Ӧ��һ�����������ڶ����������������඼��д�˷����� 
Object ��� toString ��������һ���ַ��������ַ����������������Ǹ����һ��ʵ������at ��Ƿ���@���ʹ˶����ϣ����޷���ʮ�����Ʊ�ʾ��ɡ����仰˵���÷�������һ���ַ���������ֵ���ڣ� 

getClass().getName() + '@' + Integer.toHexString(hashCode())
*/
		System.out.println(p1.toString());//p1���治��.toString().  java ��������Ĭ�ϼ��ϡ�Person@61de33
		System.out.println(p1.getClass().getName()+"$"+Integer.toHexString(p1.hashCode()));//Person@61de33



//		Person p3 = p1;

//		Demo d = new Demo();

//		System.out.println(p1==p2);
//		System.out.println(p1.equals(p2));
	}
}
