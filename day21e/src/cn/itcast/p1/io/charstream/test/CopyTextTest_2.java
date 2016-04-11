package cn.itcast.p1.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_2 {

	private static final int BUFFER_SIZE = 1024;

	/**
	 * 【缓冲区对操作的内容，进行临时的缓存，没有缓冲，读写的频率很高，切换很快，读一个写一个。有缓冲，读一块，存一块。】
	 * 
	 * 写代码有以下两部分优化：
	 * 
	 * 设计优化： 对代码进行重构，让代码实现更强的扩展性、灵活性、复用性。可以加入很多设计模式来完成。
	 * 性能优化：为了提高性能，往里面加点东西。比如：缓冲区。【超市  推车里面放一个框】
	 * @param args
	 */
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("IO流_2.txt");
			fw = new FileWriter("copytest_2.txt");
			
			//创建一个临时容器，用于缓存读取到的字符。
			char[] buf = new char[BUFFER_SIZE];//这就是缓冲区。 【我们自己创建的缓冲区，缓冲区  可以提高效率】
			
			//定义一个变量记录读取到的字符数，(其实就是往数组里装的字符个数 )
			int len = 0;
			
			while((len=fr.read(buf))!=-1){//【循环次数少，效率高】
				fw.write(buf, 0, len);//buf - 要写入的字符缓冲区		0 - 偏移量，从该处开始读取字符		len - 要写入字符的数量 

			}
			
		} catch (Exception e) {
//			System.out.println("读写失败");
			throw new RuntimeException("读写失败");
		}finally{
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();//【最好抛出异常，图形化界面弹出对话框，没有地方打印】
				}
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}

}
