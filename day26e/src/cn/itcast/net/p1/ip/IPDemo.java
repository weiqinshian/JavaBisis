package cn.itcast.net.p1.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	/**
	 * 1���������������ַ��������www.sina.com����
2���������ȡ����hosts�ļ�����ѯ�������Ƿ��ӦIP��ַ��
3��������ڶ���ʧ�ܣ���������������ϵ�DNS�����������õ�����������ѯ������Ӧ��IP��ַ��
4�����������IP��ַ���ҵ���Ӧ�ķ�������
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {

		//��ȡ��������ip��ַ���� �������������ˣ��쳣�� �鿴api �ĵ�
		InetAddress ip = InetAddress.getLocalHost();
		
		//��ȡ����������ip��ַ���󡣡���������Ⱥ����Ӧ��IP��ַ�ж�������ص�ip��ַ��һ�����顿
		//ip = InetAddress.getByName("192.168.1.110");//InetAddress.getByName("my_think");
		
		ip = InetAddress.getByName("www.baidu.com");
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());//������Ƚ�����Ҫ��������
	}

}
