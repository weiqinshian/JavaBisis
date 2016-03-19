package cn.itcast.p2.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

//需求：将一些文字存储到硬盘一个文件中。

public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {//【 IOException写文件，要指定路径，万一，程序到其他电脑，没有写入的路径 无E盘

		//创建一个可以往文件中写入字符数据的字符输出流对象。
		/*
		 * 既然是往一个文件中写入文字数据，那么在创建对象时，就必须明确该文件(用于存储数据的目的地)。
		 * 
		 * 如果文件不存在，则会自动创建。
		 * 如果文件存在，则会被覆盖。
		 * 
		 * 如果构造函数中加入true，可以实现对文件进行续写！
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		
		/*
		 * 调用Writer对象中的write(string)方法，写入数据。 
		 * 
		 * 其实数据写入到临时存储缓冲区【流】中。
		 * 
		 */
		fw.write("abcde"+LINE_SEPARATOR+"hahaha");//【获取系统换行符】
//		fw.write("xixi");
		
		/*
		 * 进行刷新，将数据直接写到目的地中。
		 */
		
//		fw.flush();【可以用多次，类似，记事本 保存 ，写一下 ，保存一下】
		
		/*
		 * 关闭流，关闭资源。在关闭前会先调用flush刷新缓冲中的数据到目的地。
		 */
		fw.close();//【类似，关闭 记事本程序】
		
//		fw.write("haha");// java.io.IOException: Stream closed
		
		
		
	}

}
