/*
���ڽǱ������������ڣ������ýǱ�Խ���ʾ��
���ڸ���Ϊ�Ǳ�������׼���ø����Ǳ��쳣����ʾ��

�����Ǳ������쳣��java�в�û�ж������
�ǾͰ���java�쳣�Ĵ���˼�룬������󣬽������Ǳ�����Զ�������������װ�ɶ���

�����Զ��������������Ϊ�Զ����쳣�� 



ע�⣺�����һ�����Ϊ�쳣�࣬����Ҫ�̳��쳣��ϵ����Ϊֻ�г�Ϊ�쳣��ϵ����������ʸ�߱������ԡ�
	�ſ��Ա������ؼ�����������throws throw

Exception���ࣩ �쳣��ϵ������Է�Ϊ�����ࡣһ���ǣ��ܼ�⣨��飩�쳣��һ���ǣ�������쳣��Ҳ������ʱ�쳣��RuntimeException


�쳣�ķ��ࣺ
1������ʱ������쳣:ֻҪ��Exception�������඼�ǣ�������������RuntimeException��ϵ�� 
		��������һ�����֣�ϣ���ڱ���ʱ�ͽ��м�⣬�����������ж�Ӧ�Ĵ���ʽ��
		���������ⶼ��������ԵĴ���


2������ʱ������쳣(����ʱ�쳣):����Exception�е�RuntimeException�������ࡣ
		��������ķ������޷��ù��ܼ����������޷����У���������Ϊ�����ߵ�ԭ���µĶ������������ڲ�״̬�ĸı䵼�µģ����̣߳���
		��ô��������һ�㲻����ֱ�ӱ���ͨ����������ʱ���õ����ߵ���ʱ�ĳ���ǿ��ֹͣ���޷������У�,�õ����߶Դ������������



�����Զ����쳣ʱ��Ҫô�̳�Exception��Ҫô�̳�RuntimeException��


throws ��throw������

1��throwsʹ���ں����ϡ�
   throwʹ���ں����ڡ�
2��throws�׳������쳣�࣬�����׳�������ö��Ÿ�����
   throw�׳������쳣����


*/
class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);//�����Ѿ��ѹ��ܶ�ʵ���ˡ�����ֻ��Ҫ���ø���Ĺ��췽���Ϳ�����
	}
}


class Demo
{
	public int method(int[] arr,int index)//throws NullPointerException//FuShuIndexException ΪʲôҪ�����쳣����ϣ���õ����ߴ�����쳣�� ����֮�󣬳������⣬�������£���ջ���治�������溯���ף�֪���ҵ�����쳣�ķ���
	{		

		if(arr==null)
			throw new NullPointerException("��������ò���Ϊ�գ�");//NullPointerException Ϊʲô���� ��method �������׳�����Ϊ��һ����������������ǳ����أ��������в���ȥ������ʱ�쳣����ֱ���ڴ�ͣ�����ã����÷��ص�main ����������ȥ����
			//java �������ȼ���﷨�����ټ���߼����󡣣�δ����ģ��쳣���������﷨����

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�Խ���������ǣ����ǲ��Ƿ��ˣ���"+index);//�����쳣̫���أ��׳�û������
		}
		if(index<0)
		{
			throw new FuShuIndexException("�Ǳ��ɸ���������");
		}
		return arr[index];
	}
}

class  ExceptionDemo3
{
/*
main ��������method ������ܣ��������������method�����ڲ������⣬method ����Ӧ��Ҫ�� �ڲ����ڵ�������� main�������ߣ�

�������ܿ����� �ǹ��ܵ��������ڲ������Ѿ���װ�ˡ� ���ǰ����������ں����ϣ��õ����ߵ��õ�ʱ�򣬾��ܹ���ȷ�Ŀ������ܷ��������⡣

���������쳣�ĺ�����������ҲҪ����������ʽ֮һ �������׳������գ����������
*/
	public static void main(String[] args) //throws FuShuIndexException
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("over");
	}
	
}

/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Person  //�쳣��ʵ��ԭ���������ʾ�� �����Ѿ��ѹ��ܶ�ʵ���ˡ�����ֻ��Ҫ���ø���Ĺ��췽���Ϳ�����
{
	Student(String name)
	{
		super(name);
	}
}
*/