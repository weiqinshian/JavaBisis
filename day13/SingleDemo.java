
/*
���߳��µĵ���

*/

//����ʽ
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;//ֻ��һ����䲻�����̰߳�ȫ����
	}
}
//����ʽ

����ͬ��Ϊ�˽�����̰߳�ȫ���⡣

����˫���ж���Ϊ�˽��Ч�����⡣




class Single
{
	private static Single s = null;

	private Single(){}

	public static Single getInstance()
	{
		if(s==null)//�����Ч�ʡ�,����ÿ���ж��������Ч������
		{
			synchronized(Single.class)//�������ȫ���⡿
			{
				if(s==null)
		//				-->0 -->1 �����߳�ͬʱ�������new ���������󣬻�����̰߳�ȫ����
					s = new Single();
			}
		}
		return s;
	}
}
class  SingleDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
