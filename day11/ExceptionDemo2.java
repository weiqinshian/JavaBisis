
/*

*/
class Demo
{
	public int method(int[] arr,int index)
	{		

		if(arr==null)
			throw new NullPointerException("数组的引用不能为空！");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("数组的角标越界啦，哥们，你是不是疯了？："+index);
		}
		if(index<0)
		{
			throw new ArrayIndexOutOfBoundsException("数组的角标不能为负数，哥们，你是真疯了！："+index);
			//如果不写这句话，java 虚拟机也会throw new  ArrayIndexOutOfBoundsException
			//throw 抛出异常，抛向随？ 抛向调用者。谁调用该方法就抛向谁。函数里面的抛出异常语句 一旦执行，该语句后面的语句将不再执行！
			//虚拟机收到抛出异常语句，会将异常信息打印到控制台。  项目开发时，会设置系统日志，来保存 项目运行过程中抛出的异常。 
 		}                                                                                                
		return arr[index];
	}
}

class  ExceptionDemo2
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("over");
	}
	
}
