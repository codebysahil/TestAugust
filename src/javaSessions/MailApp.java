package javaSessions;

public class MailApp {
	
	// how to call static method
	// using the class name
	
	
	public void sendMail() {
		System.out.println("in the send mail method");
		
	}
	public static void sendInfo() {
		System.out.println("in the static send info method");
	}
	
	

	public static void main(String[] args) {
	  // call using the class name
         MailApp.sendInfo();
      // call the method directly 
         sendInfo();
      // call it by using the object reference--> it can be done but not recommened by java
	}

}
