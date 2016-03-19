class OperateDemo2 
{
	public static void main(String[] args) 
	{
		//赋值运算符。=  += -= *= /= %=
//		int a,b,c;
//		a = b = c = 4;

		//int a = 4;
		//a+=2;//a = a + 2;

		short s = 3;// 1、先检查 是否在范围内。 2、自动完成强制转换（赋值运算所具备的特点）
		//s+=4;// 不报错，是因为 底层有自动转换过程，和 赋值类似，类似一次赋值运算。等价于(short)(s + 4);
                //s=s+4;//报错     
		s = (short)(s + 4);


		System.out.println("s="+s);
	}
}
