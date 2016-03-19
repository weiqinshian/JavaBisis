package cn.itcast.io.p4.sequence.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class SequenceInputStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		
		/*
		 * 【一个读取流，只能关联一个源。我有多个读取流，关联多个源】
		 * 
		 * 通过集合，将多个流，合并为一个流。【SequenceInputStream 将多个源 ，合并为一个源】
		 * 
		 * 多个流对象，将数据写入同一个文件中
		 * 
		 * 需求：将1.txt 2.txt 3.txt文件中的数据合并到一个文件中。【都是字节流】
		 */
		
//		Vector<FileInputStream> v = new Vector<FileInputStream>();		【Vector 过时了，要慎用，编译器不认识】
//		v.add(new FileInputStream("1.txt"));
//		v.add(new FileInputStream("2.txt"));
//		v.add(new FileInputStream("3.txt"));
//		Enumeration<FileInputStream> en = v.elements();
		
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for(int x=1; x<=3; x++){
			al.add(new FileInputStream(x+".txt"));
		}
		
		Enumeration<FileInputStream> en = Collections.enumeration(al);//【没有这个对象，那就找集合的工具类，没有对象找方法，静态方法，那个方法能够返回枚举类型对象】
		//【上面这行代码，集合工具类中的enumeration 方法，封装了，下面这段 代码】
		
		
		/*
		final Iterator<FileInputStream> it = al.iterator();【枚举被，迭代器取代，他们两个功能重复。
		                                                                                                                    内部类访问局部变量的时候，变量要final 】
		                                                                                                                            
		                                               【实现原理】                                                                              
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>(){

			@Override
			public boolean hasMoreElements() {
				
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
				
				return it.next();
			}
			
		};*/
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("1234.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		
	}

}
