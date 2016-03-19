package cn.itcast.p1.otherapi;

import java.util.Calendar;

public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();		
		int year = 2012;
		showDays(year);//����ȡÿһ���2�� �����ж����졣�����꼴�ɡ�����ȡ�������ڵ����ʱ��Ҳһ������ʱ��ƫ��һ�켴��
	}

	/**
	 * @param c
	 */
	public static void showDays(int year) {//���룬��
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);//���´�0 ��ʼ		
		c.add(Calendar.DAY_OF_MONTH, -1);//��3��1�� ����ƫ��һ�죬������2�����һ��		
		showDate(c);
	}

	/**
	 * @param c
	 */
	public static void showDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);//��Ϊʲô����data �࣬��Ϊ���������ʻ���
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.println(year+"��"+month+"��"+day+"��"+getWeek(week));
	}

	public static String getWeek(int i) {
		
		String[] weeks = {"","������","����һ","���ڶ�","������","������","������","������"};
		
		return weeks[i];
	}
	
	

}
