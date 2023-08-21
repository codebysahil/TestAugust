package oop_Inheritance;

public class Car extends Vehicle {
	
	String name;
	int price;
	
	public void start() {
		System.out.println("Car start");
	}
	public void stop() {
		System.out.println("Car stop");
	}
	public void refuel() {
		System.out.println("Car refuel");
	}
	
	public static void run() {
		System.out.println("Car -- Run");
	}
	
	public void billing() {
		System.out.println("car---billing");
	}
	
	@Override
	public void aeroDynamic() {
		System.out.println("car --- aerodynamic");
	}
	
	public  Car(String name , int price) {
		this.name = name;
		this.price = price;
		System.out.println(name);
		System.out.println(price);

	
	} 
	public Car() {
		System.out.println("car class 0 parameter constructor");
	}



}
