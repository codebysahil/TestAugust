package oop_Inheritance;

public class BMW extends Car {
	// start method is overridden method
	
	public BMW() {
		super();
	}
	@Override
	public void start() {
		System.out.println("BMW --Start");
	}

	public void autoParking() {
		System.out.println("BMW --AUTOPARking");
	}
	@Override
	public void engine() {
		System.out.println("BMW engine");
	}
	
	public void autoStart() {
		System.out.println("BMW- AutoStart");
	}
	
	// child class can have same method as that of parent class
	// this is called as method hiding
	//public static void run() {
		//System.out.println("BMW -- Run");
	//}
	public void billing() {
		System.out.println("car---billing");
	}
	@Override
	public void aeroDynamic() {
		System.out.println("BMW --- aerodynamic");
	}
// Overriding is always used when you don't like your parent class methods	
	

}
