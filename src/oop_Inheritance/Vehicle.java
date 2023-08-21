package oop_Inheritance;

public class Vehicle extends Automobile {
	
	public void engine() {
		System.out.println("vehicle engine");
	}
	@Override
	public void aeroDynamic() {
		System.out.println("vehicle --- aerodynamic");
	}


}
