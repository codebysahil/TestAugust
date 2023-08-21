package javaSessions;

import java.util.Arrays;

public class ObjectArrays {
// program of object static array to store differrent data types
// default value of the object array : ---null
	public static void main(String[] args) {
		
		Object obj [] = new Object[5];
		obj[0] = "sahil";
		obj[1] = 33;
		obj[2] = "satija";
		obj[3] = false;
		obj[4] = 98.15;
		
		System.out.println(Arrays.toString(obj));
		
		for (int i = 0;i < obj.length;i++) {
			
			System.out.println(obj[i]);
		}
		

	}

}
