class BreakContinueDemo 
{
	public static void main(String[] args) 
	{

		/*
		��break:��������
		break���õķ�Χ��Ҫô��switch��䣬Ҫô��ѭ����䡣
		��ס����break��䵥������ʱ�����治Ҫ����������䣬��Ϊִ�в�����
			break�������ڵĵ�ǰѭ������Ƕ��ѭ��ֻ��һ�㣬����break���ڲ㣩
			���������ѭ��Ƕ�ף�break��Ҫ����ָ����ѭ��������ͨ���������ɡ�

		
		for(int x=0; x<3; x++)
		{
			if(x==1)//if����break ʲôʱ������break�����ǣ����ö��� switch  �� ѭ����
				break;
			System.out.println("x="+x);
		}
		

		xiaoqiang:for (int x=0; x<3 ;x++ )
		{
			wangcai:for (int y=0; y<4 ; y++)
			{
				System.out.println("x="+x);
				break xiaoqiang;//������ѭ��
			}
			
		}*/

		/*
		continue:������
		���õķ�Χ��ѭ���ṹ�����뿪����ṹ��continue ��û������ģ������ʧ�ܣ�
		continue����������ѭ���������´�ѭ����
		���continue��������ʱ�����治Ҫ���κ���䣬��Ϊִ�в�����



		

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
