class BreakContinueDemo 
{
	public static void main(String[] args) 
	{

		/*
		【break:跳出。】
		break作用的范围：要么是switch语句，要么是循环语句。
		记住：当break语句单独存在时，下面不要定义其他语句，因为执行不到。
			break跳出所在的当前循环。（嵌套循环只跳一层，既是break所在层）
			如果出现了循环嵌套，break想要跳出指定的循环，可以通过标号来完成。

		
		for(int x=0; x<3; x++)
		{
			if(x==1)//if控制break 什么时候跳，break跳的是（作用对象） switch  和 循环。
				break;
			System.out.println("x="+x);
		}
		

		xiaoqiang:for (int x=0; x<3 ;x++ )
		{
			wangcai:for (int y=0; y<4 ; y++)
			{
				System.out.println("x="+x);
				break xiaoqiang;//结束外循环
			}
			
		}*/

		/*
		continue:继续。
		作用的范围：循环结构。（离开这个结构，continue 是没有意义的，编译会失败）
		continue：结束本次循环，继续下次循环。
		如果continue单独存在时，下面不要有任何语句，因为执行不到。



		

		for (int x=0; x<11 ;x++ )
		{
			if(x%2==0)
				continue;
			System.out.println("x="+x);
		}
		*/
		xiaoqiang:for (int x=0; x<3 ;x++ )
		{
			wangcai:for (int y=0; y<4 ; y++)
			{
				System.out.println("x="+x);
				continue xiaoqiang;
			}
			
		}
	
	}
}
