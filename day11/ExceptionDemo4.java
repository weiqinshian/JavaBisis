/*
其一：声明以便抛出： 在函数上用throws 关键字 对 方法进行声明。以便调用者对该问题预先定义处理方式

其二：异常处理的捕捉形式：
这是可以对异常进行针对性处理的方式。

具体格式是：

try//翻译：尝试，检测；类似地铁安检
{
	//需要被检测异常的代码。 try发现问题，就往catch 里面抛
}
catch(异常类 变量)//该变量用于接收发生的异常对象。 翻译 捕捉
{
	//处理异常的代码。
}
finally//翻译：最终化
{
	//一定会被执行的代码。
}





异常处理的原则：
1，函数内部如果抛出需要检测的异常（不是运行时的异常），那么函数上必须要声明。（用throws 关键字声明）
	否则必须在函数内用try catch捕捉，否则编译失败。
	
2，如果调用到了声明异常的函数，要么try catch要么throws，否则编译失败。

3，什么时候catch，什么时候throws 呢？
	功能内部可以解决，用catch。（方法内部可以解决，问题的引发，是否由此处决定的）
	解决不了，用throws告诉调用者，由调用者解决 。

4，一个功能如果抛出了多个异常，那么调用时，必须有对应多个catch进行针对性的处理。
	内部又几个需要检测的异常，就抛几个异常，抛出几个，就catch几个。



	什么时候


*/


class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}


class Demo
{
	public int method(int[] arr,int index)//throws NullPointerException,FuShuIndexException //向调用者声明，我有这个问题
	{	
		if(arr==null)
			throw new NullPointerException("没有任何数组实体");// 运行时异常，可以不在 method 方法上抛出
		if(index<0)
			throw new FuShuIndexException();
			
		return arr[index];
	}
}

class  ExceptionDemo4
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];		
		Demo d = new Demo();
		/*
		类似楼道里面的灭火器，预先准备好，为了防止突发火灾。
		我们谁都不喜欢看到这种情况，但是，我们不能保证 这种情况不会出现。
		所以，我们设立一个 预防机制。程序里面体现是异常，现实类比，灭火器。
		*/
		try//只检测可能引发异常的代码块 ，try 只做了一个动作，把检测到的代码块的异常对象，丢给 catch 异常变量的对象
		{
			int num = d.method(null,-1);
			System.out.println("num="+num);
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch (FuShuIndexException e)//针对性处理问题
		{
			System.out.println("message:"+e.getMessage());
			System.out.println("string:"+e.toString());

			e.printStackTrace();//jvm默认的异常处理机制就是调用异常对象的这个方法。

			System.out.println("负数角标异常!!!!");
		}
		/*
		catch(Exception e)//多catch父类的catch放在最下面。 否则，编译失败。因为，多个catch 从上往下运行。父类放在最上面，下面的catch 运行不到
		{
			
		}
		*/
		System.out.println("over");//如果发生FuShuIndexException异常，catch ，里面已经解决了，程序可以继续运行。
	}
	
}
