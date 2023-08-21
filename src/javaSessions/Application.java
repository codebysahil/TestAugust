package javaSessions;

import java.util.ArrayList;

public class Application {
	
	ArrayList<String> ar = new ArrayList<String>(); 
	public ArrayList<String> getMenulinks(String pageName) {
		
		if(pageName.trim().equalsIgnoreCase("loginPage")) {
			ar.add("username");
			ar.add("password");
			ar.add("sign-in");
			
			
		}
		else if(pageName.trim().equalsIgnoreCase("homePage")) {
			ar.add("price");
			ar.add("products");
			ar.add("categories");
			

			
		}
		else {
			
			System.out.println("no page found...");
		}
		return ar;
	}

	public static void main(String[] args) {

		Application al = new Application();
		ArrayList<String> op = al.getMenulinks("homePAGE   ");
		System.out.println(op);
	
		
		

	}

}
