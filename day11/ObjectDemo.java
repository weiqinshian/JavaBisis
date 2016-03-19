/*
Object:所有类的根类。
Object是不断抽取而来，具备着所有对象都具备的共性内容。
常用的共性功能：
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
	//比较Person的年龄。是否是同龄人
	public boolean compare(Person p)
	{
		return this.age == p.age;	
	}
	*/

	/*
	一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否相同的依据。
	equals和== 一样都是比较对象的地址，查看jdk源码 equals 方法内部也是用 == 实现的
	那既然有了 == 为什么还 要equals 呢？ 是 为了 方便 子类 覆盖 equals 方法。
	既然是为了覆盖，为什么 object 不将 equals 方法定义为抽象方法？  如果将object类里面的 equals 方法定义为抽象方法，那么，我们所定义的每一个类都要重写该抽象方法。否则为抽象类
	
	*/

	public boolean equals(Object obj)//Object obj = p2; 重写 object 类中的 equals 方法
	{
		if(!(obj instanceof Person))
		{
//			return false;
			throw new ClassCastException("类型错误"); //因为是运行时异常，所以，在equals 方法上面不要声明
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

	public String toString()//重写 object 对象中的 toString 方法，字符串是一种特殊的格式，java 认为所有对象都能 转化为字符串 
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
			
/* java 编译的时候，会将每一个类编译为字节码文件， 这些字节码文件有 共性。 那就是，每个字节码文件都有 属性、方法、构造器。对字节码文件进行向上抽取 成为一个类 Class。（首字母大写）

*/
//		Class clazz1 = p1.getClass();//得到对象P1的 字节码文件。
//		Class clazz2 = p2.getClass();
//		System.out.println(clazz1==clazz2);// true 。因为，p1 和 p2 都是由 Person类 创建的对象，所以，他们 字节码文件是同一个。
//		System.out.println(clazz1.getName());

/*toString 方法。返回该对象的字符串表示。通常，toString 方法会返回一个“以文本方式表示”此对象的字符串。结果应是一个简明但易于读懂。建议所有子类都重写此方法。 
Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象哈希码的无符号十六进制表示组成。换句话说，该方法返回一个字符串，它的值等于： 

getClass().getName() + '@' + Integer.toHexString(hashCode())
*/
		System.out.println(p1.toString());//p1后面不加.toString().  java 编译器会默认加上。Person@61de33
		System.out.println(p1.getClass().getName()+"$"+Integer.toHexString(p1.hashCode()));//Person@61de33



//		Person p3 = p1;

//		Demo d = new Demo();

//		System.out.println(p1==p2);
//		System.out.println(p1.equals(p2));
	}
}
