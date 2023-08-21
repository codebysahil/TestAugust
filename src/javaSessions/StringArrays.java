package javaSessions;

import java.util.Arrays;

public class StringArrays {

	public static void main(String[] args) {
		
		  String emp[] = new String[5];
		  emp[0] = "sahil";
		  emp[1] = "tom";
		  emp[2] = "hanks";
		  emp[3] = "silver";
		  emp[4] = "iron";
		  
		  System.out.println(Arrays.toString(emp));
		  
		  for (int i = 0; i< emp.length;i++) {
			  
			  if(emp[i].equals("hanks")) {
				  System.out.println(" the array missed to add the value");
				  break;
			  }
			  System.out.println("The employees are as below: " + emp[i]);
		  }
		  
		  
		  
	}

}
