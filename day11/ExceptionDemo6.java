�쳣��ע�����
1�������ڸ��Ǹ��෽��ʱ������ķ�������׳����쳣��
��ô����ķ���ֻ���׳�������쳣���߸��쳣�����ࡣ
2����������׳�����쳣����ô����ֻ���׳������쳣���Ӽ���
��˵�����า�Ǹ���ֻ���׳�������쳣������������Ӽ��� 
ע�⣺�������ķ���û���׳��쳣����ô���า��ʱ���Բ����ף���ֻ��try .
interface  Inter
{
	void function();
}

class D implements Inter
{
	public void function()//throws Exception �׳��쳣���뱨��ֻ�ܲ�׽
	{}
}


class A extends Exception 
{
}

class B extends A
{
}
class C extends Exception 
{
}


Exception
	|--A
		|--B
	|--C


class Fu
{
	void show()throws A
	{}
}


class Test
{
	void method(Fu f)//Fu f  = new Zi();
	{
		try
		{
			f.show();//��̬�����뿴��ߣ����п��ұߣ����� ����� show �������׳�C�쳣
			
		}
		catch (A  a)
		{
		}
	}
}


class Zi extends Fu
{
	void show()throws C//�����׸���������쳣��Ҫô�׸���һ�����쳣��Ҫô�� �����쳣 ����
	{
	
	}
}




class  
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(new Zi());
	}
}
