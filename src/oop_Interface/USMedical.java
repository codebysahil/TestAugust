package oop_Interface;

public interface USMedical {
	
	//can not have method body
	// no method body means abstract method =>only method declaration
	// interface cannot have any business logic
	// cannot create the object of the interface in java
	// 2 major changes after jdk 1.8 in interface
	// 1.)  we can have static methods  with method body in an interface
	
	public void cardioService();
	public void neuroServices();
	public void physioServices();
	public void emergencyServices();
	// static method has to be called with the interface name
	public static void billing() {
		System.out.println("US medical static  billing");
	}
	

}
