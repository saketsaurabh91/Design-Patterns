package design.pattern.prototpye;

public class ProtoTypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employeeList = new Employees();
		employeeList.loadEmployees();
		System.out.println("First hashcode ->" + employeeList.hashCode());

		Employees emp1 = (Employees) employeeList.clone();
		emp1.getEmployees().add("ClonedEmp");
		displayEmployees(emp1);

		System.out.println("Hashcode after cloning ->" + emp1.hashCode());
	}

	//showing the employee list is cloned
	public static void displayEmployees(Employees emp1) {

		for (String s : emp1.getEmployees()) {
			System.out.println(s);
		}
	}

}
