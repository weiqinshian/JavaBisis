
/*

*/
class Demo
{
	public int method(int[] arr,int index)
	{		

		if(arr==null)
			throw new NullPointerException("��������ò���Ϊ�գ�");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�Խ���������ǣ����ǲ��Ƿ��ˣ���"+index);
		}
		if(index<0)
		{
			throw new ArrayIndexOutOfBoundsException("����ĽǱ겻��Ϊ���������ǣ���������ˣ���"+index);
			//�����д��仰��java �����Ҳ��throw new  ArrayIndexOutOfBoundsException
			//throw �׳��쳣�������棿 ��������ߡ�˭���ø÷���������˭������������׳��쳣��� һ��ִ�У������������佫����ִ�У�
			//������յ��׳��쳣��䣬�Ὣ�쳣��Ϣ��ӡ������̨��  ��Ŀ����ʱ��������ϵͳ��־�������� ��Ŀ���й������׳����쳣�� 
 		}                                                                                                
		return arr[index];
	}
}

class  ExceptionDemo2
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("over");
	}
	
}
