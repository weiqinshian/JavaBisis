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
		 * PrintWriter���ַ���ӡ�������ܳ��á�
		 * ���캯��������
		 * 1���ַ���·����
		 * 2��File����
		 * 3���ֽ��������
		 * 4���ַ��������
		 * 
		 */
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));//��û���漰�����˼������⣬ֻ�ǣ������ʹ�ã��鿴API �ĵ���
		
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"),true);
		
		String line =  null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());//����ӡ�����������棬close ��ʱ��ˢ�£���������
//			out.flush();
		}
		
		out.close();
		bufr.close();
	}

}
