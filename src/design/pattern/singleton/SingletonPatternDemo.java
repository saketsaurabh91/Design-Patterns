package design.pattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		SingletonObject so = SingletonObject.getInstance();
		System.out.println("first hash: " + so.hashCode());
		try (FileOutputStream fos = new FileOutputStream(new File("atttester.ser"))) {

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(so);
			oos.close();

			System.out.println("creating object again");

			FileInputStream fis = new FileInputStream(new File("atttester.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			SingletonObject readobj = (SingletonObject) ois.readObject();
			ois.close();

			System.out.println("second hash: " + readobj.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}