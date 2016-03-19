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
	 * ���ڴ��ж�������������ӳ����ŵ����ڴ��У����г־û����´���Ҫ�õ������ݵ�ʱ�� ����Ҫ��new ��ֱ�Ӷ����ɡ�
	 * 
	 * ����ֻ�Ǵ洢�ã���Ҫ�ü��±��������������ض��ķ�ʽ����������õ���
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
//		writeObj();
		readObj();
	}

	public static void readObj() throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		//����ķ����л��� 
		Person p = (Person)ois.readObject();//��Ӳ������Ķ���
		
		System.out.println(p.getName()+":"+p.getAge());
		
		ois.close();
		
	}

	public static void writeObj() throws IOException, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));//�����ݴ洢��Ӳ�����棬���ļ�����ʽ���֡�
		//�������л���  �����л��Ķ������ʵ��Serializable�ӿڡ� ����Ҫ���⹦�ܾ�����ҡ�
		oos.writeObject(new Person("Сǿ",30));//��������洢��Ӳ���ϡ�
		
		oos.close();
		
		
		
	}

}
