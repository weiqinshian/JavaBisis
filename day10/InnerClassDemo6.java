class Outer
{

/*
创建object 子类对象。

class Inner extends Object
{
  public void show();
}

上面这种写法 等价于，下面这种写法

new Object()
	{
	public void show()
	{
	System.out.println("show run");
	}
};
上面这种写法是object 类的 匿名 子对象
*/

	void method()
	{
		Object obj = new Object()
		{
			public void show()
			{
				System.out.println("show run");
			}

		};
		obj.show();//因为匿名内部类这个子类对象被向上转型为了Object类型。
					//这样就不能再使用子类特有的方法了。
	}
}

class InnerClassDemo6 
{
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
