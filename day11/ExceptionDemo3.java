/*
对于角标是整数不存在，可以用角标越界表示，
对于负数为角标的情况，准备用负数角标异常来表示。

负数角标这种异常在java中并没有定义过。
那就按照java异常的创建思想，面向对象，将负数角标进行自定义描述。并封装成对象。

这种自定义的问题描述成为自定义异常。 



注意：如果让一个类称为异常类，必须要继承异常体系，因为只有称为异常体系的子类才有资格具备可抛性。
	才可以被两个关键字所操作，throws throw

Exception（类） 异常体系下面可以分为两大类。一种是，受检测（检查）异常。一种是，不检测异常，也叫运行时异常。RuntimeException


异常的分类：
1，编译时被检测异常:只要是Exception和其子类都是，除了特殊子类RuntimeException体系。 
		这种问题一旦出现，希望在编译时就进行检测，让这种问题有对应的处理方式。
		这样的问题都可以针对性的处理。


2，编译时不检测异常(运行时异常):就是Exception中的RuntimeException和其子类。
		这种问题的发生，无法让功能继续，运算无法进行，更多是因为调用者的原因导致的而或者引发了内部状态的改变导致的（多线程）。
		那么这种问题一般不处理，直接编译通过，在运行时，让调用者调用时的程序强制停止（无法再运行）,让调用者对代码进行修正。



所以自定义异常时，要么继承Exception。要么继承RuntimeException。


throws 和throw的区别。

1，throws使用在函数上。
   throw使用在函数内。
2，throws抛出的是异常类，可以抛出多个，用逗号隔开。
   throw抛出的是异常对象。


*/
class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);//父类已经把功能都实现了。子类只需要调用父类的构造方法就可以了
	}
}


class Demo
{
	public int method(int[] arr,int index)//throws NullPointerException//FuShuIndexException 为什么要声明异常，是希望让调用者处理该异常。 声明之后，出了问题，不关我事，在栈里面不断向下面函数抛，知道找到解决异常的方法
	{		

		if(arr==null)
			throw new NullPointerException("数组的引用不能为空！");//NullPointerException 为什么不用 在method 方法上抛出，因为，一旦出现这种情况（非常严重，程序运行不下去，运行时异常），直接在此停掉更好，不用返回到main 方法里面再去处理
			//java 编译器先检查语法错误，再检查逻辑错误。（未报告的）异常是最后检查的语法错误。

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("数组的角标越界啦，哥们，你是不是疯了？："+index);//这种异常太严重，抛出没有意义
		}
		if(index<0)
		{
			throw new FuShuIndexException("角标变成负数啦！！");
		}
		return arr[index];
	}
}

class  ExceptionDemo3
{
/*
main 方法调用method 这个功能（方法），而这个method功能内部有问题，method 方法应该要把 内部存在的问题告诉 main（调用者）

调用者能看到的 是功能的声明，内部代码已经封装了。 我们把问题声明在函数上，让调用者调用的时候，就能够明确的看到可能发生的问题。

调用声明异常的函数，调用者也要做处理，处理方式之一 ，就是抛出。最终，抛向虚拟机
*/
	public static void main(String[] args) //throws FuShuIndexException
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("over");
	}
	
}

/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Person  //异常的实现原理如此列所示， 父类已经把功能都实现了。子类只需要调用父类的构造方法就可以了
{
	Student(String name)
	{
		super(name);
	}
}
*/