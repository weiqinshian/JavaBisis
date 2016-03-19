/*
ֹͣ�̣߳�
1��stop������

2��run�������������߳�����û���ˡ�
���������̵߳�ԭ���ǣ���Щ����Ҫִ�кܶ�Σ����ԣ���������ͬʱִ�С�
��ô�����̵߳����������?
�����ж�����ѭ���ṹ��ֻҪ����סѭ���Ϳ��Խ�������

����ѭ��ͨ�����ö����ǡ�ѭ������������ɡ����ı�ѭ��������ʵ�ֽ�������

��������̴߳����˶���״̬���޷���ȡ��ǡ���ν����أ�

����ʹ��interrupt()�������̴߳Ӷ���״̬ǿ�ƻָ�������״̬���������߳̾߱�cpu��ִ���ʸ� 

��ʱǿ�ƶ����ᷢ����InterruptedException���ǵ�Ҫ����

�����е��̶߳����������̲Ż������
*/
class StopThread implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();//t0 t1
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"....."+e);
				flag = false;
			}
			
			System.out.println(Thread.currentThread().getName()+"......++++");
		}
	}
	public void setFlag()
	{
		flag = false;
	}
}



class StopThreadDemo 
{
	public static void main(String[] args) 
	{
		StopThread st = new StopThread();

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);

		t1.start();
		t2.setDaemon(true);//���ã�t2�߳�Ϊ��̨�̣߳����������е��̶߳��Ǻ�̨�߳�ʱ��ǰ̨�̶߳��������ˣ�ֻʣ��̨�߳��ˣ������������Java ������˳��� 
		t2.start();

		int num = 1;
		for(;;)
		{
			if(++num==50)
			{

//				st.setFlag();
				t1.interrupt();//���̴߳Ӷ���״̬ǿ�ƻָ�������״̬���������߳̾߱�cpu��ִ���ʸ� 
//				t2.interrupt();
				break;
			}
			System.out.println("main...."+num);
		}

		System.out.println("over");
	}
}
