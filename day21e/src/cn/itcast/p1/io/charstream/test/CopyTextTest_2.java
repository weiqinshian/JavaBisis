package cn.itcast.p1.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_2 {

	private static final int BUFFER_SIZE = 1024;

	/**
	 * ���������Բ��������ݣ�������ʱ�Ļ��棬û�л��壬��д��Ƶ�ʺܸߣ��л��ܿ죬��һ��дһ�����л��壬��һ�飬��һ�顣��
	 * 
	 * д�����������������Ż���
	 * 
	 * ����Ż��� �Դ�������ع����ô���ʵ�ָ�ǿ����չ�ԡ�����ԡ������ԡ����Լ���ܶ����ģʽ����ɡ�
	 * �����Ż���Ϊ��������ܣ�������ӵ㶫�������磺��������������  �Ƴ������һ����
	 * @param args
	 */
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("IO��_2.txt");
			fw = new FileWriter("copytest_2.txt");
			
			//����һ����ʱ���������ڻ����ȡ�����ַ���
			char[] buf = new char[BUFFER_SIZE];//����ǻ������� �������Լ������Ļ�������������  �������Ч�ʡ�
			
			//����һ��������¼��ȡ�����ַ�����(��ʵ������������װ���ַ����� )
			int len = 0;
			
			while((len=fr.read(buf))!=-1){//��ѭ�������٣�Ч�ʸߡ�
				fw.write(buf, 0, len);//buf - Ҫд����ַ�������		0 - ƫ�������Ӹô���ʼ��ȡ�ַ�		len - Ҫд���ַ������� 

			}
			
		} catch (Exception e) {
//			System.out.println("��дʧ��");
			throw new RuntimeException("��дʧ��");
		}finally{
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();//������׳��쳣��ͼ�λ����浯���Ի���û�еط���ӡ��
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
