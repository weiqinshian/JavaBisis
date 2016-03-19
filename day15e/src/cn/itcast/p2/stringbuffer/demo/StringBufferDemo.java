package cn.itcast.p2.stringbuffer.demo;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * StringBuffer:就是字符串缓冲区。【内部还是通过数组实现的，只是将数组封装了】
		 * 用于存储数据的容器。【数组也是容器，也能存东西】
		 * 特点：
		 * 1，长度的可变的。 【数组长度固定】
		 * 2，可以存储不同类型数据。【数组存储同一类型数据】
		 * 3，最终要转成字符串进行使用。
		 * 4，可以对字符串进行修改。
		 * 
		 * 
		 * 既然是一个容器对象。应该具备什么功能呢？
		 * 1，添加：
		 * 		StringBuffer append(data);
		 * 		StringBuffer insert(index,data);
		 * 2，删除：【delete 或者 remove】
		 * 		StringBuffer delete(start,end):包含头，不包含尾。
		 * 		StringBuffer deleteCharAt(int index):删除指定位置的元素 
		 * 3，查找：
		 * 		char charAt(index);
		 * 		int indexOf(string);
		 * 		int lastIndexOf(string);
		 * 4，修改：
		 * 		StringBuffer replace(start,end,string);
		 * 		void setCharAt(index,char);
		 * 
		 * 增删改查  C(create)U(update)R(read)D(delete) 
		 * 
		 * 
		 * 
		 */
		bufferMethodDemo();
	}
	
	private static void bufferMethodDemo_2() {
		StringBuffer sb = new StringBuffer("abce");
		
//		sb.delete(1, 3);//ae
		
		//清空缓冲区。
//		sb.delete(0,sb.length());
//		sb = new StringBuffer();
		
//		sb.replace(1, 3, "nba");
//		sb.setCharAt(2, 'q');
		
//		sb.setLength(10);
		
//		System.out.println("sb:"+sb);
//		System.out.println("len:"+sb.length());
		
		System.out.println(sb.reverse());
		
		
	}

	private static void bufferMethodDemo_1() {
		StringBuffer sb = new StringBuffer("abce");
		
//		sb.append("xixi");
		sb.insert(2, "qq");
		/**
		 * insert(int offset,boolean b)
		 *   将 boolean 参数的字符串表示形式插入此序列中。 
			    第二个参数将被转换成字符串，就好象使用了 String.valueOf 方法一样。然后，将所得字符串中的字符追加到此序列。 
			  offset 参数必须大于等于 0，且小于等于此序列的长度。 
		 */
		
		System.out.println(sb.toString());
	}

	public static void bufferMethodDemo(){
		//创建缓冲区对象。
		StringBuffer sb = new StringBuffer();		
		sb.append(4).append(false);
		sb.insert(1, "haha");		
		System.out.println(sb);
		
	}
	
	

}
