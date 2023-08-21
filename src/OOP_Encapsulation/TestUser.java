package OOP_Encapsulation;

public class TestUser {

	public static void main(String[] args) {

		
		User u1= new User("Sahil",29, false);
		System.out.println(u1.getName());
		System.out.println(u1.isListed());
		u1.setListed(true);
		System.out.println("-----after updation");
		System.out.println(u1.isListed());
	
	}

}
