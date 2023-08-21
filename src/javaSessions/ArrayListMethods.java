package javaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
	
		ArrayList < String> nameList = new ArrayList<String>();
		nameList.add("sahil");
		nameList.add("rocky");
		nameList.add("peter");
		nameList.add("pooja");
		nameList.add(1, null);
		nameList.add(5,"Lisa");
		//System.out.println(nameList.size());
		
		//System.out.println(nameList);
		
		for( int i= nameList.size()-1;i>=0;i--) {
			System.out.println(nameList.get(i));
		}
		System.out.println("--------------------------------------------------");
		// Collections class in Java Provides various methods
		// Collections class methods can be used only with the arrayList and not with the array
		
		Collections.reverse(nameList);
		System.out.println(nameList);
	}

}
