package javaSessions;

public class Customer {
	
	// no input no return
	
	public void testCode() {
		System.out.println("this is the test method");
		
		
	}
	public void printMyName() {
		System.out.println("my name is Sahil");
		String name ="sahil";
		System.out.println("The Programmer name is  : " + name);
	}
	
	
	// no input and some return
	 
	public int doSum() {
		int num = 100;
		int num1 = 200;
		int sum = num + num1;
		return sum;
			
	}
	
	public String getTrainerName() {
		String name = "sahil";
		return name;
	}

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.testCode();	
		c.printMyName();
		System.out.println("ending");
		int sum =c.doSum();
		System.out.println(sum);
		System.out.println("------------------------------");
		System.out.println(c.doSum());
		System.out.println(c.getTrainerName());

	}

}
