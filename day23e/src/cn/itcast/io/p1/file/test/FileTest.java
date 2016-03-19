package cn.itcast.io.p1.file.test;

import java.io.File;

/*
 * 需求：对指定目录进行所有内容的列出（包含子目录中的内容）
 * 也可以理解为 深度遍历。
 * 
 * 
 */

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File dir = new File("e:\\demodir");
		
		listAll(dir,0);
	}

	public static void listAll(File dir,int level) {
		
	
		System.out.println(getSpace(level)+dir.getName());//【level 是为了打印缩进，为了美观，好看】
		//获取指定目录下当前的所有文件夹或者文件对象
		
		level++;
		File[] files = dir.listFiles();
		
		for(int x=0; x<files.length; x++){
			
			if(files[x].isDirectory()){
				listAll(files[x],level);//【递归，自己调用自己，用到了自己这个功能，用到那个功能调用那个功能 】
			}
			else
				System.out.println(getSpace(level)+files[x].getName());
		}	
	}

	private static String getSpace(int level) {//【打印空格，为了美观】
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("|--");
		for(int x=0; x<level; x++){
			sb.insert(0,"|  ");
		}
		
		return sb.toString();
	}
	

}
