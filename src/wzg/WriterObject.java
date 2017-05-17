package wzg;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriterObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.txt")))
		{
			Person person = new Person("µ°µ°", 23);
			oos.writeObject(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
