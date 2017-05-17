package wzg;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriterObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个ObjectOutputStream输出流
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.txt")))
		{
			Person person = new Person("蛋蛋", 23);
			//将对象写入输出流
			oos.writeObject(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
