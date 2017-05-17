package wzg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(//创建一个ObjectInputStream输入流
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt")))
		{
			//从输入流读取一个Java对象，并将其强制类型转换为Person类
			Person person=(Person)ois.readObject();
			System.out.println("名字为："+person.getName()+"\n年龄为："+person.getAge()+"岁");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
