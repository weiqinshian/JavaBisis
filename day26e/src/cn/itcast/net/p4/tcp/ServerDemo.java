package cn.itcast.net.p4.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		����˽��տͻ��˷��͹��������ݣ�����ӡ�ڿ���̨�ϡ� 
		/*
		 * ����tcp����˵�˼·��
		 * 1�����������socket����ͨ��ServerSocket����
		 * 2������˱�������ṩһ���˿ڣ�����ͻ����޷����ӡ������������氲װ�ˣ��ṩ����������ͨ��ip �ҵ���̨������ͨ���˿ڣ��ҵ� �������
		 * 3����ȡ���ӹ����Ŀͻ��˶��󡣡�ͨ����ȡ�ÿͻ��˵Ķ������Ϳͻ��������ж�ȡ�����ж���ͻ������ӷ���˵�ʱ�򲻻��ҡ���
		 * 4��ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷��������� 
		 * 		����ӡ�ڿ���̨�ϡ�
		 * 5���ر���Դ���ؿͻ��ˣ��ط���ˡ� ��ͬһʱ�䣬���ӷ���˵Ŀ����ж�����������ͬʱ�������������ޣ����У�Ҫ�ڷ���˹رտͻ��ˣ���ͼ������
		 */
		
		//1��������˶���
		ServerSocket ss = new ServerSocket(10002);
		
		//2,��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();//����ʽ.
		
		String ip = s.getInetAddress().getHostAddress();
		
		//3��ͨ��socket�����ȡ��������Ҫ��ȡ�ͻ��˷���������
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+":"+text);
		
		
		
		
		
				
		s.close();
		ss.close();//������һ�㲻�ر�
		
	}

}
