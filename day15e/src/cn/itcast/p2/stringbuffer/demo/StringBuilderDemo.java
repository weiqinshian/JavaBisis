package cn.itcast.p2.stringbuffer.demo;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*
		 * jdk1.5�Ժ�����˹��ܺ�StringBufferһģһ���Ķ��󡣾���StringBuilder
		 * 
		 * ��ͬ���ǣ�
		 * StringBuffer���߳�ͬ���ġ�ͨ�����ڶ��̡߳�
		 * StringBuilder���̲߳�ͬ���ġ�ͨ�����ڵ��̡߳� ���ĳ������Ч�ʡ�
		 * 
		 * jdk������
		 * 1������д����ͨ�����������ԡ�
		 * 2�����Ч�ʡ�
		 * 3�����Ӱ�ȫ�ԡ���������д���鷳��
		 * 
		 * �� JDK 5 ��ʼ��Ϊ���ಹ����һ�������߳�ʹ�õĵȼ��࣬�� StringBuilder���������ȣ�
		 * ͨ��Ӧ������ʹ�� StringBuilder �࣬��Ϊ��֧��������ͬ�Ĳ���������������ִ��ͬ���������ٶȸ��졣 ������Ҫ�ж�����
		 * 
		 */
		
		
	}

}
/*
StringBuffer ���ڲ�ʵ��ԭ��

class StringBuffer jdk1.0�����ȿ��ǵ��ǰ�ȫ����ο���Ч�ʡ�����һ��StringBuilder ����һ���߳�����������ӣ�һ���߳���������ɾ�������ʱ��ͻ���ְ�ȫ������
{
	object lock;
	public   StirngBuffer append(int x)//��ӵ�ʱ����ɾ����ɾ����ʱ������ӡ�ɾ�������Ҫ����ͬ��
	{
		synchronized(lock)
		{
		}
	}
	
	
	public synchronized StringBuffer delete(int start,int end)
	{
		synchronized(lock)
		{
		}
	}
}

�����߳� ����StringBuilder  ���߳���  StringBuffer��








*/

