
/*
�쳣���ǲ�������������Ҳ�кܶ಻̫���������������
��д�����ʱ�򣬾������ⲻ�����ķ����������磬Ϊ�˷�ֹ��ð�������ȱ�ҩ���ϰ�������

�����ð�ˣ���ҩ��ȥҽԺ�����ˮ

�������̴��� �� ���⴦�������Ϻܽ���

�Գ������������������ķ�ʽ������ ������������װ

java ������Ƕ������ԣ�����Ҳ�Ƕ��󡣶����Ա�������������֣�������Ϣ������λ�á��õ�������󣬾��õ�����Щ��Ϣ��

�쳣�����ڡ����С�ʱ�ڷ����Ĳ������������


��java���������ʽ�Բ�������������������ͷ�װ����

������������������࣬�ͳ�Ϊ�쳣�ࡣ 

��ǰ�������̴�������⴦���������ϣ�
���ڽ��������̴�������⴦��������롣����Ķ���.


��ʵ�쳣����javaͨ����������˼�뽫�����װ���˶���.

���쳣��������������
��ͬ�����⣨�������֣�������Ϣ������λ�� ��ͬ���ò�ͬ������о���������� ����Ǳ�Խ�硣��ָ��ȵȡ�

����ܶ࣬��ζ����������Ҳ�ܶ࣬
���乲�Խ������ϳ�ȡ���γ����쳣��ϵ��

�������⣨������������ͷֳ��������ࡣ
Throwable�Ǵ�����쳣 �ĸ��࣬���� �����������
Throwable:������error�������쳣�����⣬���ⷢ����Ӧ�ÿ����׳����õ�����֪����������
			//����ϵ���ص������Throwable�������е����඼���п����ԡ�
			�����Ե���ָ����ʲô�أ���ô���ֿ������أ�
			��ʵ��ͨ�������ؼ��������ֵġ�
			throws throw ,���ǿ��Ա��������ؼ�������������Ͷ��󶼾߱�������.
	|--1��һ�㲻�ɴ����ġ�Error����Error������ʾ��
			�ص㣺����jvm�׳��������Ե����⡣�������⴦�����ˣ�����Ӱ�쵽�����ִ�С�
				 �������ⷢ��һ�㲻����Դ�����ֱ���޸ĳ���
	|--2�����Դ����ġ�Exception�������쳣���ǿ��Խ�������Դ�����

�����ɷ����֣�������( ��ð������ ���� �쳣) �Ͳ����������ǵ�  error��

����ϵ���ص㣺
	����ĺ�׺���������丸������Ϊ��׺���Ķ��Ժܺá�
*/
 
class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[1024*1024*800];//java.lang.OutOfMemoryError: Java heap space
//		arr = null;
//		System.out.println(arr[3]);
//
//
//		sleep(-5);
	}


	public static void sleep2(int time)
	{
		if(time<0)//���⴦������,Ϊ�˱�֤����Ľ�׳��
		{
//			�����취��
//			�����취��
//			�����취��
//			�����취��
//			�����취��
		}
		if(time>100000)
		{
//			�����취��
//			�����취��
//			�����취��
//			�����취��
//			�����취��
//			�����취��
		}
		System.out.println("��˯������"+time);//�������̴��� �� 

//		sleep(-5);
	}
	public static void sleep(int time)
	{
		if(time<0)
		{
//			�׳� new FuTime();//�ʹ�����ʱ��Ϊ�����������������л��������������ƣ���Ϣ��λ�õ���Ϣ��
		}
		if(time>100000)
		{
//			�׳� new BigTime();
		}
		System.out.println("��˯������"+time);
	}
}
/*
class FuTime
{
}
class BigTime
{
}
*/