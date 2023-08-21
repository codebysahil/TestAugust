package javaSessions;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		/* ArrayList ar = new ArrayList(3);
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(900);
		System.out.println(ar);
		System.out.println(ar.size());  */
		//generics
	/*	ArrayList <String> nameList = new ArrayList<String>();
		nameList.add("Sahil");
		nameList.add("Rocky");
		nameList.add("Maven");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		for (int k = 0; k<=nameList.size()-1;k++) {
			if(nameList.get(k).equals("Rocky")) {
				System.out.println("hello rocky , we found you");
				break;
			}
			//System.out.println(nameList.get(k));
		} 
		*/
		
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Rocky");
		empDataList.add(true);
		empDataList.add(12.33);
		empDataList.add('c');
		
		//System.out.println(empDataList.size());
		//System.out.println(empDataList);
		
		//for (int i = 0;i < empDataList.size();i++) {
		//System.out.println(empDataList.get(i));
		//}
		System.out.println("-------------------------------------------");
		
		for(Object e: empDataList) {
			if(e.equals("Rocky")) {
				System.out.println("hello rocky");
				break;
			}
			//System.out.println(e);
		}
		

	}

}
