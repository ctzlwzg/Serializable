package wzg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt")))
		{
			Person person=(Person)ois.readObject();
			System.out.println("����Ϊ��"+person.getName()+"\n����Ϊ��"+person.getAge()+"��");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
