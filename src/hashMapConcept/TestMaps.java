package hashMapConcept;

import java.util.HashMap;

public class TestMaps {

	public static void main(String[] args) {

		// key- value pair and order is not maintained in the HashMaps

		HashMap<String, Integer> smap = new HashMap<String, Integer>();
		smap.put("tom",100);
		smap.put("Peter",250);
		smap.put("Lisa",300);
		smap.put("Naveen",400);
		smap.put("Sahil",500);
		smap.put(null,00);
		smap.put(null,400);
		System.out.println(smap.get("Sahil"));
		System.out.println(smap);
		
		smap.forEach((k,v) ->System.out.println(k+":" +v));;

		

	}

}
