package cn.itcast.net.p1.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	/**
	 * 1、在浏览器输入网址的域名（www.sina.com）。
2、浏览器读取本地hosts文件，查询该域名是否对应IP地址。
3、如果，第二部失败，浏览器访问网络上的DNS服务器（公用的主机），查询域名对应的IP地址。
4、浏览器根据IP地址，找到对应的服务器；
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {

		//获取本地主机ip地址对象。 【主机解析不了，异常】 查看api 文档
		InetAddress ip = InetAddress.getLocalHost();
		
		//获取其他主机的ip地址对象。【服务器集群，对应的IP地址有多个，返回的ip地址是一个数组】
		//ip = InetAddress.getByName("192.168.1.110");//InetAddress.getByName("my_think");
		
		ip = InetAddress.getByName("www.baidu.com");
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());//【这里比较慢，要查表解析】
	}

}
