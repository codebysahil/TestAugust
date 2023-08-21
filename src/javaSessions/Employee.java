package javaSessions;

public class Employee {
	// data members: vars and methods
	int id;
	String name;
	double salary;
	String compName = "IBM"; // static method is only for the class level not for any method means I can't declare static variable in any of the method

	public static void main(String[] args) {
		// inside the main method we have to create an object
		
		Employee emp = new Employee();// what is object here, emp is the object reference name and  object is new Employee()
		 System.out.println(emp.id);
		 System.out.println(emp.name);
		 System.out.println(emp.salary);

	}

}
