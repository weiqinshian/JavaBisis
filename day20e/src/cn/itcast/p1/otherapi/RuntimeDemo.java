package cn.itcast.p1.otherapi;

import java.io.IOException;

public class RuntimeDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * ���κγ������ж�Ҫ����ϵͳ��windowsϵͳ������ڴ棬�����ַ�ռ䣬�������windows�����������һ������Դ��Runtime ʵ������Ҫ���Ǵ�������
		 * Runtime:û�й��췽��ժҪ��˵�����಻���Դ������󡣡����캯����˽�л��ˡ�
		 * �ַ��ֻ��зǾ�̬�ķ�����˵������Ӧ���ṩ��̬�ķ��ظ������ķ�����
		 * ����ֻ��һ����˵��Runtime��ʹ���˵������ģʽ������֤������ʱjava �����Ψһ�ԡ�
		 * 
		 */
		
		Runtime r = Runtime.getRuntime();//��������һ������ʱ���󣬸�����˭�ء�
		
//		execute: ִ�С� xxx.exe 
		
		Process p = r.exec("notepad.exe");//�������ļ�������ʧ�ܣ����ԣ��׳��쳣����java ������Ӳ�������ִ���ļ���
                                       //��notepad.exe  ��ǰ·������û���ҵ�����path ·����ȥ�ҡ�
		//����Process ���ǳ���ģ�û�����࣬�̳в��ˣ������޷�������ֻ�д���Ӧ�ó��򣬲���ȥ�������̡�
		
		//Process p = r.exec("notepad.exe c:\\RuntimeDemo.java");��c��������ļ�\ ��ת���ַ������ԣ�Ҫ��\\
		Thread.sleep(5000);
		p.destroy();
	}

}
