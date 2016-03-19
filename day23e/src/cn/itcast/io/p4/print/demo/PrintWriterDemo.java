package cn.itcast.io.p4.print.demo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter：字符打印流。【很常用】
		 * 构造函数参数：
		 * 1，字符串路径。
		 * 2，File对象。
		 * 3，字节输出流。
		 * 4，字符输出流。
		 * 
		 */
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));//【没有涉及到设计思想的问题，只是，对象的使用，查看API 文档】
		
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"),true);
		
		String line =  null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());//【打印到缓冲区里面，close 的时候刷新，缓冲区】
//			out.flush();
		}
		
		out.close();
		bufr.close();
	}

}
