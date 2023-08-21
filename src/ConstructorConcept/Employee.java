package ConstructorConcept;

public class Employee {

	
	String name;
	int age;
	double salary;
	boolean isPerm;
	
	 int Employee()
	    {
	        return 0;    // Warning for the return type
	    }
	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println(e1.Employee());
		
		
	}

}
