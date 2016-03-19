package cn.itcast.gui.p1.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	/**
	 * 
	 * 一般做窗体应用程序都是c++、Delphi。不用java ，因为java效率低，要安装java 虚拟机
	 * @param args
	 */
	public static void main(String[] args) {

		Frame f = new Frame("my frame");
//		f.setSize(500, 400);		
//		f.setLocation(400, 200);
		f.setBounds(400, 200, 500, 400);		
		f.setLayout(new FlowLayout());//设置流式布局
		
		Button but  = new Button("一个按钮");
		
		f.add(but);//将按钮添加到窗体中。 
		
		
		f.addWindowListener(new WindowAdapter() {//【添加监听器，事件和监听器有对应关系】
//【抽象类中，没有抽象方法】
			@Override
			public void windowClosing(WindowEvent e) {
				
//				System.out.println("closing......."+e);
				System.exit(0);
			}
			
		});
		
		
		//在按钮上加上一个监听。
		but.addActionListener(new ActionListener() {//【匿名内部类】
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("button run .....");
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		System.out.println("over");
	}

}
