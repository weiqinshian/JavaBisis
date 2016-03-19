

/*
�ȴ�/���ѻ��ơ� ���ô�����Ƭ��

�漰�ķ�������ʹ������������������ʱ�����Ҫ��ȷ�Լ����������� �����������ǲ��������̵߳ķ�����

1��wait(): ���̴߳��ڶ���״̬����ͬʱ���߳��ͷ�ִ��Ȩ��ִ���ʸ񡿱�wait���̻߳ᱻ�洢���̳߳ء����ӣ�����������װ�̵߳��������С�
2��notify():�����̳߳���һ���߳�(����).
3��notifyAll():�����̳߳��е������̡߳�������״̬����ʱ����״̬���߱������ʸ�

��Щ���������붨����ͬ���С�
��Ϊ��Щ���������ڲ����߳�״̬�ķ�����
����Ҫ��ȷ���ײ��������ĸ����ϵ��̡߳���һ��������������кܶ�ͬ�����кܶ�����Ҫ��ȷ�ı����ĸ������̡߳������ص��ǶԶ���߳̽���ͬ����

�����磺���ĸ��߳�����������������ģ������ǵ������������еġ��ҵ�������ķ��������߳̽��в�����ʱ���������ķ������ܶ�����������߳̽��в�������

Ϊʲô�����̵߳ķ���wait notify notifyAll��������Object���У� 

��Ϊ��Щ�����Ǽ������ķ�������������ʵ��������������̵߳�����״̬��
������������Ķ�������Ķ�����õķ�ʽһ��������Object���С�

*/
//��Դ
class Resource
{
	String name;
	String sex;
	boolean flag = false;
}


//����
class Input implements Runnable
{
	Resource r ;
//	Object obj = new Object();
	Input(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException e){}//r �� �ڵ���wait �������߳�һ�����ͽ�����r����r��������̣߳���r�������wait ���� �ı�״̬�� ֻ����r�������nofify ���������ѡ� 
				if(x==0)
				{
					r.name = "mike";
					r.sex = "nan";
				}
				else
				{
					r.name = "����";
					r.sex = "ŮŮŮŮŮŮ";
				}
				r.flag = true;
				r.notify();// ���Զ�α�����
			}
			x = (x+1)%2;

		}
	}
}
//���
class Output implements Runnable
{

	Resource r;
//	Object obj = new Object();
	Output(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.flag)
					try{r.wait();}catch(InterruptedException e){}
				System.out.println(r.name+"....."+r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}



class  ResourceDemo2
{
	public static void main(String[] args) 
	{
		//������Դ��
		Resource r = new Resource();
		//��������
		Input in = new Input(r);
		Output out = new Output(r);
		//�����̣߳�ִ��·����
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//�����߳�
		t1.start();
		t2.start();
	}
}
