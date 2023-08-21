package javaSessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		// ArrayList is default class in Java so no need to create this class
		// it is a collection and it is order based or index based means it will maintain the order/index.
		ArrayList ar = new ArrayList();
		ar.add(100); // will be added to the 0 position
		ar.add(200); // will be added to the 1 position
		int len = ar.size();
		System.out.println(len);
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(5));

	}

}
