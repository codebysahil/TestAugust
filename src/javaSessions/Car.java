package javaSessions;

public class Car {
	// wheels = 4 is a common property value not a common property
	String name;
	int price;
	String color;
	static int wheels = 4;  // stored in a separate memory area i.e not heap or not stack but CMA(Common memory allocation) also called as permanent generation and after jdk 1.8 it is known as metaspace.

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name="BMW";
		c1.price = 30;
		c1.color = "Red";
		
		
		Car c2	 = new Car();
		c2.name="Audi";
		c2.price = 40;
		c2.color = "White";
		
		Car c3 = new Car();
		c3.name="Honda";
		c3.price = 20;
		c3.color = "Black";
		
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + Car.wheels);
// how to access static variables??
// this is done by class name
		System.out.println(Car.wheels);  // this the best practice to access it with the class name
// within the same class it can be accessed directly also
		System.out.println(wheels);
		
	}

}
