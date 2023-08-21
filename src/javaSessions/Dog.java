package javaSessions;

public class Dog {
	
	int size;
	String name;
	
	public void bark() {
		
		if(size >60) {
			System.out.println("woof,woof");
		}
		else if(size >14) {
			System.out.println("jiff, jiff");
		
		}
		else {
			System.out.println("yipp, yipp");
		}
	}
	
	public void makeSound(int numofTimes) {
		
		while(numofTimes>0) {
			System.out.println("woof woof");
			numofTimes--;
		}
		
		
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d.size=70;
		d1.size =15;
		d2.size = 10;
		d.bark();
        d1.bark();
        d2.bark();
        d.makeSound(9);
				

	}

}
