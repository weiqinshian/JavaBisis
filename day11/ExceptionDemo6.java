异常的注意事项：
1，子类在覆盖父类方法时，父类的方法如果抛出了异常，
那么子类的方法只能抛出父类的异常或者该异常的子类。
2，如果父类抛出多个异常，那么子类只能抛出父类异常的子集。
简单说：子类覆盖父类只能抛出父类的异常或者子类或者子集。 
注意：如果父类的方法没有抛出异常，那么子类覆盖时绝对不能抛，就只能try .
interface  Inter
{
	void function();
}

class D implements Inter
{
	public void function()//throws Exception 抛出异常编译报错。只能捕捉
	{}
}


class A extends Exception 
{
}

class B extends A
{
}
class C extends Exception 
{
}


Exception
	|--A
		|--B
	|--C


class Fu
{
	void show()throws A
	{}
}


class Test
{
	void method(Fu f)//Fu f  = new Zi();
	{
		try
		{
			f.show();//多态，编译看左边，运行看右边，调用 子类的 show 方法，抛出C异常
			
		}
		catch (A  a)
		{
		}
	}
}


class Zi extends Fu
{
	void show()throws C//不能抛父类以外的异常，要么抛父类一样的异常，要么抛 父类异常 子类
	{
	
	}
}




class  
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(new Zi());
	}
}
