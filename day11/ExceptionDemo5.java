

class Demo
{
	public int show(int index)throws ArrayIndexOutOfBoundsException
	{

		if(index<0)
			throw new ArrayIndexOutOfBoundsException("越界啦！！");
		int[] arr = new int[3];
		return arr[index];
	}
}


class ExceptionDemo5 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			
			int num = d.show(-1);
			System.out.println("num="+num);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());

//			return ;//不执行 System.out.println("over");
//			System.exit(0);//退出jvm。
		}
		finally//通常用于关闭(释放)资源。（如：数据库连接）
		{
			System.out.println("finally");
		}

		System.out.println("over");

	}
}
/*

连接数据库
查询。Exception 查询出了问题，后面的代码不执行，数据库应该马上关闭连接
关闭连接。

*/


/*
try catch finally 代码块组合特点：

1，
try catch finally

2,
try catch(多个)当没有必要资源需要释放时，可以不用定义finally。

3,
try finally 异常无法直接catch处理，但是资源需要关闭。 


void show()throws Exception
{
	try
	{
		//开启资源。
		throw new Exception();//有异常，没有处理，就要声明
	}
	finally  //没有处理异常，所以，函数 还是需要throws 即抛出异常
	{
		//关闭资源。
		
	}


	/*
	catch(Exception e)
	{
		
	}
	*/
	
}


*/