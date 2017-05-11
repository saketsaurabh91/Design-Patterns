package design.pattern.prototpye;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Employees implements Serializable, Cloneable {

	// will go with generic later
	private List<String> employees;

	public Employees() {
		employees = new ArrayList<>();
	}

	public void loadEmployees() {
		employees.add("fist-emp");
		employees.add("second-emp");
		employees.add("third-emp");
	}

	// deep clone using serialization
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employees newEmployee = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			newEmployee = (Employees) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Exception while reading from stream or object conversion" + e.getMessage());
		}
		return newEmployee;
	}

	public List<String> getEmployees() {
		return employees;
	}

}
