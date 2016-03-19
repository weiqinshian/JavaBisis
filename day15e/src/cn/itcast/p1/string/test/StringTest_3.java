package cn.itcast.p1.string.test;

/*
 * 3，两个字符串中最大相同的子串。
 * "qwerabcdtyuiop"
 * "xcabcdvbn"
 * 
 * 思路：
 * 1，既然取得是最大子串，先看短的那个字符串是否在长的那个字符串中。
 * 如果存在，短的那个字符串就是最大子串。
 * 2，如果不是呢，那么就将短的那个子串进行长度递减的方式去子串，去长串中判断是否存在。
 * 如果存在就已找到，就不用在找了。
 * 
 * 
 */
public class StringTest_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "qwerabcdtyuiop";
		String s2 = "xcabcdvbn";
		/*
		 * s2  长度为9： "xcabcdvbn"
		 * s2  长度为8  有2个： "xcabcdvb"  "cabcdvbn"
		 * s2  长度为7 有3个： "xcabcdv"  "cabcdvb"  "abcdvbn"
	    * 角标相对原字符串位置 0     7    1     8    2     9
		 * */

		String s = getMaxSubstring(s2, s1);
		System.out.println("s=" + s);
	}

	/**
	 * 获取最大子串
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String getMaxSubstring(String s1, String s2) {
		
		String max = null,min = null;
		max = (s1.length()>s2.length())?s1:s2;
		
		min = max.equals(s1)?s2:s1;
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		
		
		
		for (int i = 0; i < min.length(); i++) {
			
			for(int a = 0,b = min.length()-i; b != min.length()+1; a++,b++){//【b = min.length()-i 是关键地方  b != min.length()+1 也是关键地方】
				
				String sub = min.substring(a, b);
//				System.out.println(sub);
				if(max.contains(sub))
					return sub;
			}
		}
		
		return null;
	}
}
