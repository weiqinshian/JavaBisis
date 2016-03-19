package cn.itcast.p1.generic.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	/**
	 * 引用数据类型不确定的时候，才用泛型表示。泛型里面不能定义基本数据类型）{int}。 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] arr = new int[4];
//		arr[0] = 3.0;
		
		
		ArrayList<String> al = new ArrayList<String>();//为了避免以后出现安全隐患，在定义容器的时候明确，其中装什么类型元素。就好像数组一样
		
		al.add("abc");//public boolean add(Object obj)
		al.add("hahah");
//		al.add(4);//等价于al.add(new Integer(4));  前面 是装 string 类型，现在装intger 类型，都自动提升为object 类型， 在Iterator 中String str = （String）it.next().的时候报错。intger不能转化为string
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			
			String str = it.next();//因为，Iterator<String>，所以，不要强转（String）
			System.out.println(str);
		}
	}

}



