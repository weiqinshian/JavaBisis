package cn.itcast.p1.string.demo;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*���ӵ�15�ο�ʼ����java ���ù��߶��󣬹ʶ�Ҫ�õ� ��̹��ߡ� ����p1 ��ʾ package1 ����һ��������
		 * String����ص㣺
		 * �ַ�������һ������ʼ���Ͳ��ᱻ�ı䡣
		 * 
		 */
		stringDemo2();
	}

	public static void stringDemo2() {
		// TODO Auto-generated method stub
		
		String s = "abc";//����һ���ַ��������ڳ������С�	�����ڴ��д���һ�������أ������string ������Щ�����ǿ��Ա�����ġ���	
		String s1 = new String("abc");//������������һ��newһ���ַ��������ڶ��ڴ��С������ڴ浱����new�ķ�ʽ������һ��string ���󣬲�û�����ַ��������ص������κ����顣��
		//�����һ�仰�����ڴ��д���һ������ �ڶ��仰�����ڴ��д�������������1��new String������һ������2��������ʵ�Ρ�abc��������Ϊ����ʵ�Σ��������Ҫ�ȴ��ڡ�
		
		System.out.println(s==s1);//false  �Ƚϵ�ַ��ʱ�򣬷�����������ַ��һ����
		
		System.out.println(s.equals(s1));//����д֮�󣬱Ƚϵ������ݣ������ǵ�ַ��
		//string���е�equals��дObject�е�equals������string���Լ����ж��ַ��������Ƿ���ͬ�����ݡ�
		//��ʵ���ǱȽ��ַ������ݡ�
		
		
//		System.out.println("s="+s);
//		System.out.println("s1="+s1);
		
	}

	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ��������ص��ص�.
	 * ����û�оͽ����������У�ֱ���á�
	 */
	private static void stringDemo1() {
		String s = "abc";//"abc"�洢���ַ����������С���Ҳ��Ϊ�ַ���������������֮ǰ�����ڻ������в鿴���Ƿ��С�abc����	
//		s = "nba";
		String s1 = "abc";		
		System.out.println(s==s1);//true? == �Ƚ� ����ĵ�ַ
//		System.out.println("s="+s);
	}

}
