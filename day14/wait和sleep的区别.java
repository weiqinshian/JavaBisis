

wait �� sleep ����

1��wait����ָ��ʱ��Ҳ���Բ�ָ����
   sleep����ָ��ʱ�䡣

2����ͬ����ʱ����cpu��ִ��Ȩ�����Ĵ���ͬ��
	wait���ͷ�ִ��Ȩ���ͷ������������������ȴ�����������ͷ��������ܶԸ������� notifyAll��
	sleep:�ͷ�ִ��Ȩ�����ͷ�����
�����Ƕ��������̴߳��ڶ���״̬�����ͷ�ִ��Ȩ��ִ���ʸ�

����֮��ͬ�����棬�Ǹ��߳��������Ǹ��߳�ִ�С�

class Demo
{

	void show()
	{
		synchronized(this)// 
		{
		 
			wait();//t0 t1 t2��notifyAll ִ��֮��3���̶߳����ˣ� ����ִ��Ȩ���ȴ�ִ���ʸ������cpuʱ��Ƭ ѡ��t0 ����ôt0Ҳ��һ��ִ�У���
			                 //��ͬ����ʱ����cpu�߳�ִ��Ҫ��������û����
		
		}
	}
	void method()
	{
		synchronized(this)//t4
		{
		
			//wait();

			notifyAll();
		
		
		}//��t4 ����߳�ִ����֮�󣬲Ż��ͷ�������ʱ�����ᱻt0 t1 t2 ����һ�����У�˭���У�˭ִ�С�
	}
}




class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
