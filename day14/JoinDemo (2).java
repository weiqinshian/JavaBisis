class Demo implements Runnable
{
	public void run()
	{
		for(int x=0; x<50; x++)
		{
			System.out.println(Thread.currentThread().toString()+"....."+x);
			Thread.yield();//�ͷ��߳�cpu ִ��Ȩ
		}
	}
}

class  JoinDemo
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();


		t2.start();
//		t2.setPriority(Thread.MAX_PRIORITY);//�����ȼ�Խ���ȡcpuִ��Ȩ�ļ���Խ�ߡ� ��̬����


//		t1.join();//t1�߳�Ҫ���������������С���ʱ����һ���߳�����ʱ����ʹ��join�������������������߳� �ͷ�ִ��Ȩ��t1�̣߳��ȴ�t1�߳�������ֹ�������С�

		for(int x=0; x<50; x++)
		{
//			System.out.println(Thread.currentThread()+"....."+x);
		}
	}
}
