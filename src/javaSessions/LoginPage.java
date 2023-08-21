package javaSessions;

public class LoginPage {
	
	String username;
	String password;
	boolean isActive;
	double bmi;
	int age;
	char gender;
	String [] st;

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		System.out.println(lp); // prints the memory address of this object 
		System.out.println(lp.st);// default value of static array is null as array is a non-primitiva data type and deafult value for non-primitive data type is null
		System.out.println(lp.gender); // space is the default value of the character data type 
	

	}

}
