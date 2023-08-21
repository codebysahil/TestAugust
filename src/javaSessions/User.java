package javaSessions;

public class User {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		
 User u1 = new User();
 u1.name="sahil";
 u1.age=25;
 u1.city="delhi";
 User u2 = new User();
 u2.name="b";
 u2.age=26;
 u2.city="holland";
 User u3 = new User();
 u3.name="test";
 u3.age=30;
 u3.city="britain";
 
 System.out.println(u1.name);
 System.out.println(u2.name);
 //System.out.println(u3.name);
 System.out.println("-------------------------------------");
 u1=u2;
 
 System.out.println(u1.name);
 System.out.println(u2.name);
 
 
 
 
	}

}
