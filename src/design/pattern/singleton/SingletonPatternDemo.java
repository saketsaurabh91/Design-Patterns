package design.pattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		SingletonObject so1 = SingletonObject.getInstance();
		System.out.println("Hashcode of first object: " + so1.hashCode());
		try (FileOutputStream fos = new FileOutputStream(new File("DummyFile.ser"))) {

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(so1);
			oos.close();

			System.out.println("Trying to create the object again");

			FileInputStream fis = new FileInputStream(new File("DummyFile.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			SingletonObject readobj = (SingletonObject) ois.readObject();
			ois.close();

			System.out.println("Hashcode of second object: " + readobj.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}