package wzg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(//����һ��ObjectInputStream������
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt")))
		{
			//����������ȡһ��Java���󣬲�����ǿ������ת��ΪPerson��
			Person person=(Person)ois.readObject();
			System.out.println("����Ϊ��"+person.getName()+"\n����Ϊ��"+person.getAge()+"��");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
