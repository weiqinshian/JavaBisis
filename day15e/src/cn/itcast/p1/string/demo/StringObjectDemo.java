package cn.itcast.p1.string.demo;

public class StringObjectDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String s1 = "abc";
//		String s2 = "abc";
		
		//intern():���ַ����ؽ��в����� 
		
		String s1 = new String("abc");//�����ݽ�ȥ��abc�� ����Դ���룬�ڲ��ǰ�abc ��� �ַ� �����ڲ�����
		String s2 = s1.intern();//�ȼ��� String s2="abc";
		//������ intern ����ʱ��������Ѿ�����һ�����ڴ� String ������ַ������ö����� equals(Object) ����ȷ�������򷵻س��е��ַ��������򣬽��� String ������ӵ����У����ҷ��ش� String ��������á�
		System.out.println(s1==s2);
		
		
		
	}

}
