package javaSessions;

import java.util.ArrayList;

public class CarsArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("maruti");
		cars.add("Honda");
		cars.add("NExa");
		cars.add("Mahindra");
		/*for (int i = 0; i < cars.size();i++) {
			
			System.out.println(cars.get(i));
		} */
		// using for each loop
		for (String e : cars) {
			System.out.println(e);
		}
		

	}

}
