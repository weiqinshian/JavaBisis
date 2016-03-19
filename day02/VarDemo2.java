class VarDemo2
{
	public static void main(String[] args) 
	{

//		int x = 3;
//		byte b = 5;
//		x  = x + b;

//		byte b = 3;
//		b = (byte)(b + 200);//强制类型转换。

		

		//System.out.println((char)('a'+1));
//		System.out.println('你'+0);//unicode国际标准码表。


		byte b = 4;//4 是int 类型的。取最低的 一个自己，赋值给b。底层有自动强制转换过程
		//b = 3+7;//不报错，原因是因为值是确定的。
		byte b1 = 3;
		byte b2 = 7;

		//b2 = 127;
                //b2=b1+b2;//报错，原因是因为b1 、b2是变量，值是不确定的，虚拟机不能检查。
                 //System.out.println("b2");
		int x;
		//b = b1 + b2;
		int x1 =Integer.MAX_VALUE ;
		int x2 =2;
		x = x1+x2;

		//System.out.println(x);



		int n = 8;
		n = 9;
		n = 19;

		//System.out.println(n);


	
	}
}
