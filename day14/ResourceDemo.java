
/*
�̼߳�ͨѶ��
����߳��ڴ���ͬһ��Դ����������ȴ��ͬ��

���磬��һ��ú����һ�����˲��ϵļ�ú�������и����ˣ�������ú��ȥ�����߳�����һ���� 
���֮ǰ�����ĸ���ͬʱ��Ʊ��������ͬʱ��Ǯ�����Ƕ���̵߳�������һ���ġ�


*/

//��Դ��ҪΨһ��
class Resource
{
	String name;
	String sex;
}


//���� ��������
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
		/*
	��д������Ļ�������ÿ��ѭ����ע����һ��ѭ������ͬ���ģ���������ѭ������ܲ�ͬ�������ʱ�����ȥִ���������ݡ�
		*/
		{
			synchronized(r)
			{
				if(x==0)
				{
					r.name = "mike";//�����������ͬ�����߳̿����ڴ˳���������ֻ�� ���� ����ֵ�������ϴεĸ�ֵ���������Ա����ϴθ�ֵ���Ա𡣣��Ա�û�б����ǣ���
					r.sex = "nan";
				}
				else
				{
					r.name = "����";
					r.sex = "ŮŮŮŮŮŮ";
				}
			}
			x = (x+1)%2;//xֵ���֣�0 ��1 ����
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
		while(true)//����Ҫͬ������Ϊ�������������ֶ�
		{
			synchronized(r)//ͬ���������������while ѭ�����棬 ��ô��ӡ�Ľ�����ǵ�һ�ġ� ��Ϊ�ǣ���ѭ������ôһֱ��ӡ���߳�û�г�ȥ��
			{
				System.out.println(r.name+"....."+r.sex);//һ��cpu ʱ��Ƭ���������ᱻִ�ж�Ρ�
			}
		}
	}
}



class  ResourceDemo
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
