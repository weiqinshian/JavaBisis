package cn.itcast.io.p2.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cn.itcast.io.p2.bean.Person;

public class ObjectStreamDemo {

	/**
	 * @param args
	 * 
	 * 堆内存中对象的生命周期延长，放到堆内存中，进行持久化，下次再要用到该数据的时候 ，不要在new ，直接读即可。
	 * 
	 * 数据只是存储用，不要用记事本解析，解析有特定的方式【框架里面用到】
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
//		writeObj();
		readObj();
	}

	public static void readObj() throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		//对象的反序列化。 
		Person p = (Person)ois.readObject();//读硬盘上面的对象
		
		System.out.println(p.getName()+":"+p.getAge());
		
		ois.close();
		
	}

	public static void writeObj() throws IOException, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));//【数据存储到硬盘上面，以文件的形式体现】
		//对象序列化。  被序列化的对象必须实现Serializable接口。 【需要额外功能就往外挂】
		oos.writeObject(new Person("小强",30));//【将对象存储到硬盘上】
		
		oos.close();
		
		
		
	}

}
