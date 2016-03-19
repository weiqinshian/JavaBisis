/*
����ʦ�õ����ϿΡ�
�����������漰��������
����ʦ�����ԡ�
�������е����⡣
���������������ð������
*/

class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}
}

class NoPlanException extends Exception //��Ϊ�Ǳ���ʱ������쳣���ڲ�û�д��������ں�������������
{
	NoPlanException(String msg)
	{
		super(msg);
	}
}

class Computer
{
	private int state = 2;
	public void run()throws LanPingException,MaoYanException
	{
		if(state==1)
			throw new LanPingException("��������������");
		if(state==2)
			throw new MaoYanException("����ð��������");

		System.out.println("��������");
	}
	public void reset()
	{
		state = 0;
		System.out.println("��������");
	}
}

class Teacher
{
	private String name;
	private Computer comp;
	Teacher(String name)
	{
		this.name = name;
		comp = new Computer();
	}
	
	public void prelect()throws NoPlanException//�˴�Ӧ���׳�����ʱ���Ƚ��в���ȥ�쳣����������MaoYanException
	{
		try
		{
			comp.run();// Ԥ���������run �������׳������ߣ������ǵ���run �������������������쳣�������޷��ڴ˽���Ԥ�ȴ�����catch ���д���
			System.out.println(name+"����");
			
		}
		catch (LanPingException e)//�������������� �ǿ��Դ�������⣬��Ӧ��ͣ�������Ρ����ԣ���Ӧ�ñ�ɡ�����ʱ�쳣��
		{
			System.out.println(e.toString());
			comp.reset();
			prelect();
		}
		catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();
			/*�쳣ת�����ҽ��յ�����MaoYanException�쳣�����ǣ��ұ�¶��ȥ�ģ��׳��ģ��ǵ����ҵ��ˣ���Ϥ���쳣
			            ��������Ϥ��������н����
			*/
			
			//���ԶԵ��Խ���ά�ޡ�
//			throw e;//�׳���� ����ð�� �����⣬��˾�޷����
			throw new NoPlanException("��ʱ�����޷���ɣ�ԭ��"+e.getMessage());//������쳣����˾�д���ʽ�� �ż١����˴���
		}

	}
	public void test()
	{
		System.out.println("�����ϰ");
	}
}	
class ExceptionTest 
{
	public static void main(String[] args) 
	{
		Teacher t  = new Teacher("����ʦ");
		try
		{
			t.prelect();
			
		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString()+"......");
			System.out.println("����");

		}
	}
}


/*
�쳣ת�����쳣��װ��û��Ҫ��¶���쳣��Ҫ��¶��ȥ����Ϊ����¶��ȥ�ˣ�������Ҳ������

class NoAddException extends Exception
{}

void addData(Data d)throws NoAddException
{

	�������ݿ�
	try
	{
	������ݡ������쳣 SQLException();
	}
	catch(SQLException e)
	{
		//������롣

		throw new NoAddException();
	}
	fianlly
	{
	�ر����ݿ⡣
	}
}


*/