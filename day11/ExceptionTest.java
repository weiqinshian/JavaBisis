/*
毕老师用电脑上课。
问题领域中涉及两个对象。
毕老师，电脑。
分析其中的问题。
比如电脑蓝屏啦。冒烟啦。
*/

class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}
}

class NoPlanException extends Exception //因为是编译时被检测异常，内部没有处理，必须在函数上声明出来
{
	NoPlanException(String msg)
	{
		super(msg);
	}
}

class Computer
{
	private int state = 2;
	public void run()throws LanPingException,MaoYanException
	{
		if(state==1)
			throw new LanPingException("电脑蓝屏啦！！");
		if(state==2)
			throw new MaoYanException("电脑冒烟啦！！");

		System.out.println("电脑运行");
	}
	public void reset()
	{
		state = 0;
		System.out.println("电脑重启");
	}
}

class Teacher
{
	private String name;
	private Computer comp;
	Teacher(String name)
	{
		this.name = name;
		comp = new Computer();
	}
	
	public void prelect()throws NoPlanException//此处应该抛出，课时进度进行不下去异常。而，不是MaoYanException
	{
		try
		{
			comp.run();// 预处理，如果，run 方法不抛出（告诉），我们调用run 方法可能引发那两个异常，我们无法在此进行预先处理（用catch 进行处理）
			System.out.println(name+"讲课");
			
		}
		catch (LanPingException e)//电脑蓝屏啦！！ 是可以处理的问题，不应该停下来讲课。所以，不应该变成【运行时异常】
		{
			System.out.println(e.toString());
			comp.reset();
			prelect();
		}
		catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();
			/*异常转换，我接收到的是MaoYanException异常，但是，我暴露出去的（抛出的）是调用我的人，熟悉的异常
			            即对我熟悉的问题进行解决，
			*/
			
			//可以对电脑进行维修。
//			throw e;//抛出这个 电脑冒烟 的问题，公司无法解决
			throw new NoPlanException("课时进度无法完成，原因："+e.getMessage());//抛这个异常，公司有处理方式。 放假、找人代课
		}

	}
	public void test()
	{
		System.out.println("大家练习");
	}
}	
class ExceptionTest 
{
	public static void main(String[] args) 
	{
		Teacher t  = new Teacher("毕老师");
		try
		{
			t.prelect();
			
		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString()+"......");
			System.out.println("换人");

		}
	}
}


/*
异常转换，异常封装，没必要暴露的异常不要暴露出去，因为，暴露出去了，调用者也处理不了

class NoAddException extends Exception
{}

void addData(Data d)throws NoAddException
{

	连接数据库
	try
	{
	添加数据。出现异常 SQLException();
	}
	catch(SQLException e)
	{
		//处理代码。

		throw new NoAddException();
	}
	fianlly
	{
	关闭数据库。
	}
}


*/