package cn.itcast.p1.otherapi;

import java.util.Calendar;

public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();		
		int year = 2012;
		showDays(year);//【获取每一年的2月 到底有多少天。传入年即可】，获取昨天现在的这个时刻也一样，将时间偏移一天即可
	}

	/**
	 * @param c
	 */
	public static void showDays(int year) {//传入，年
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);//【月从0 开始		
		c.add(Calendar.DAY_OF_MONTH, -1);//【3月1号 ，左偏移一天，正好是2月最后一天		
		showDate(c);
	}

	/**
	 * @param c
	 */
	public static void showDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);//【为什么不用data 类，因为，他不国际化】
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.println(year+"年"+month+"月"+day+"日"+getWeek(week));
	}

	public static String getWeek(int i) {
		
		String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		
		return weeks[i];
	}
	
	

}
