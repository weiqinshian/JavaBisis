package cn.itcast.p2.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {

		FileWriter fw = null;
		try {

			fw = new FileWriter("k:\\demo.txt");

			fw.write("abcde" + LINE_SEPARATOR + "hahaha");//写失败也可能出异常

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (fw != null)//k:\\demo.txt 路径出错，fw 空指针
				try {
					fw.close();//调用windows 底层资源，出问题，我们处理不了
				} catch (IOException e) {
					// code....
					throw new RuntimeException("关闭失败");
				}
		}

	}

}
