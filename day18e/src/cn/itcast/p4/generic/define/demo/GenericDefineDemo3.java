package cn.itcast.p4.generic.define.demo;

import cn.itcast.p2.bean.Student;
import cn.itcast.p2.bean.Worker;

public class GenericDefineDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Tool<Student> tool = new Tool<Student>();
//		
//		tool.setObject(new Worker());
//		Student stu = tool.getObject();
//		Tool tool = new Tool();		
//		tool.setObject(new Worker());	//【泛型将运行时才能暴露的问题，提升到了，编译时检查， 避免的强制类型转化的麻烦】
//		Student stu = (Student)tool.getObject();
		
		
	}

}


