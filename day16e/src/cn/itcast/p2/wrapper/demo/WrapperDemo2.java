package cn.itcast.p2.wrapper.demo;

public class WrapperDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 4;
		num = num + 5;//����� int ����һ�������� Integer ����
		
		Integer i =  4;//1.5�����ԣ�����д���൱�� Integer i = new Integer(4);��1.5 ֮ǰҪ��ôд�� 
		              //Ҳ���Զ�װ��(������4��װ��Ϊ�����ں�̨����)  Ŀ�ģ�����д��
		i = i + 6;//  //  i = new Integer(i.intValue() + 6); //i.intValue() �Զ�����
		            //��iҪ��6��ӣ�i ����Ҫ�����������������ӣ��������ַ������󡣡�����Integer ���ͱ�ɻ����������ͣ���intValue ������
		            //i �ں�̨����ת������Ϊ�Զ����䡣 ���ǣ�i �Ƕ��󣬿���Ϊ null�� ���ԣ�ת��֮ǰҪ���жϡ�
		
//		show(55);//
		
		
		Integer a = new Integer(128);
		Integer b = new Integer(128);
		
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		Integer x = 129;//jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ�127���ڣ�����ô�����ݻᱻ���������¿��ٿռ䡣��y ֱ�� ָ��x ��ַ���������½�һ��y��
		Integer y = 129;
		System.out.println(x==y);//false���ɱ䡿
		System.out.println(x.equals(y));//true
		
		
	}
	
	public static void show(Object a){//Object a = new Integer(55);
		System.out.println("a="+a);
	}

}
