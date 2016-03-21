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
//		服务端接收客户端发送过来的数据，并打印在控制台上。 
		/*
		 * 建立tcp服务端的思路：
		 * 1，创建服务端socket服务。通过ServerSocket对象。
		 * 2，服务端必须对外提供一个端口，否则客户端无法连接。【服务器里面安装了，提供服务的软件。通过ip 找到那台主机，通过端口，找到 该软件】
		 * 3，获取连接过来的客户端对象。【通过获取该客户端的对象来和客户端流进行读取，当有多个客户端连接服务端的时候不会乱。】
		 * 4，通过客户端对象获取socket流读取客户端发来的数据 
		 * 		并打印在控制台上。
		 * 5，关闭资源。关客户端，关服务端。 【同一时间，连接服务端的可能有多个。服务端能同时接受连接数有限（所有，要在服务端关闭客户端，见图）。】
		 */
		
		//1创建服务端对象。
		ServerSocket ss = new ServerSocket(10002);
		
		//2,获取连接过来的客户端对象。
		Socket s = ss.accept();//阻塞式.
		
		String ip = s.getInetAddress().getHostAddress();
		
		//3，通过socket对象获取输入流，要读取客户端发来的数据
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+":"+text);
		
		
		
		
		
				
		s.close();
		ss.close();//服务器一般不关闭
		
	}

}
