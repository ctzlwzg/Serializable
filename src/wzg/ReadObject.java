package wzg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt")))
		{
			Person person=(Person)ois.readObject();
			System.out.println("名字为："+person.getName()+"\n年龄为："+person.getAge()+"岁");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
