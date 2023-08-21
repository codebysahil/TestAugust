package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setAge(25);
		e.setName("Sahil");
		//System.out.println(e.getAge());
		//System.out.println(e.getName());

		
		LoginPage lp = new LoginPage();
		LoginPage lp1 = new LoginPage();

		lp.setUserName("Sahil");
		lp1.setUserName(null);

	//System.out.println(lp.getUserName());
	System.out.println(lp1.getUserName());
	

	    
	
	}

}
