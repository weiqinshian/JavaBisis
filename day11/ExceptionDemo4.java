/*
��һ�������Ա��׳��� �ں�������throws �ؼ��� �� ���������������Ա�����߶Ը�����Ԥ�ȶ��崦��ʽ

������쳣����Ĳ�׽��ʽ��
���ǿ��Զ��쳣��������Դ���ķ�ʽ��

�����ʽ�ǣ�

try//���룺���ԣ���⣻���Ƶ�������
{
	//��Ҫ������쳣�Ĵ��롣 try�������⣬����catch ������
}
catch(�쳣�� ����)//�ñ������ڽ��շ������쳣���� ���� ��׽
{
	//�����쳣�Ĵ��롣
}
finally//���룺���ջ�
{
	//һ���ᱻִ�еĴ��롣
}





�쳣�����ԭ��
1�������ڲ�����׳���Ҫ�����쳣����������ʱ���쳣������ô�����ϱ���Ҫ����������throws �ؼ���������
	��������ں�������try catch��׽���������ʧ�ܡ�
	
2��������õ��������쳣�ĺ�����Ҫôtry catchҪôthrows���������ʧ�ܡ�

3��ʲôʱ��catch��ʲôʱ��throws �أ�
	�����ڲ����Խ������catch���������ڲ����Խ����������������Ƿ��ɴ˴������ģ�
	������ˣ���throws���ߵ����ߣ��ɵ����߽�� ��

4��һ����������׳��˶���쳣����ô����ʱ�������ж�Ӧ���catch��������ԵĴ���
	�ڲ��ּ�����Ҫ�����쳣�����׼����쳣���׳���������catch������



	ʲôʱ��


*/


class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}


class Demo
{
	public int method(int[] arr,int index)//throws NullPointerException,FuShuIndexException //������������������������
	{	
		if(arr==null)
			throw new NullPointerException("û���κ�����ʵ��");// ����ʱ�쳣�����Բ��� method �������׳�
		if(index<0)
			throw new FuShuIndexException();
			
		return arr[index];
	}
}

class  ExceptionDemo4
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];		
		Demo d = new Demo();
		/*
		����¥��������������Ԥ��׼���ã�Ϊ�˷�ֹͻ�����֡�
		����˭����ϲ������������������ǣ����ǲ��ܱ�֤ �������������֡�
		���ԣ���������һ�� Ԥ�����ơ����������������쳣����ʵ��ȣ��������
		*/
		try//ֻ�����������쳣�Ĵ���� ��try ֻ����һ���������Ѽ�⵽�Ĵ������쳣���󣬶��� catch �쳣�����Ķ���
		{
			int num = d.method(null,-1);
			System.out.println("num="+num);
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch (FuShuIndexException e)//����Դ�������
		{
			System.out.println("message:"+e.getMessage());
			System.out.println("string:"+e.toString());

			e.printStackTrace();//jvmĬ�ϵ��쳣������ƾ��ǵ����쳣��������������

			System.out.println("�����Ǳ��쳣!!!!");
		}
		/*
		catch(Exception e)//��catch�����catch���������档 ���򣬱���ʧ�ܡ���Ϊ�����catch �����������С�������������棬�����catch ���в���
		{
			
		}
		*/
		System.out.println("over");//�������FuShuIndexException�쳣��catch �������Ѿ�����ˣ�������Լ������С�
	}
	
}
