package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();// should be BMW
		b.autoParking(); // should be BMW
		b.stop(); // should be Car Class inherited
		b.refuel(); // should be Car Class inherited
		b.engine();
	System.out.println("-----------audi class------");	
		Audi a = new Audi();
		a.theftSafety();
		a.start();
		a.refuel();
	    a.engine();
		System.out.println("-----------audi class------");	
// while calling the same function in both classed the child class method is given preference

		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("-----------casting example-----");	
		// Top Casting
		// child class object is refferred by the parent class ref variable
		Car c1 =new BMW();
		
		c1.start();
		c1.stop();
		c1.engine();
		c1.refuel();
		BMW.run();
		Car.run();
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		b.aeroDynamic();
		c1.aeroDynamic();
		Automobile au = new Automobile();
		au.aeroDynamic();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Vehicle c2=new BMW();
		c2.aeroDynamic();
		c2.engine();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Automobile c3=new BMW();
		c3.aeroDynamic();
		
		// BMW w2= (BMW) new Vehicle();// this will throw class cast expcetion at the run time but not at the compile time
		// here you mean to say that all vehicles are BMW
		
		
		
	}

}
