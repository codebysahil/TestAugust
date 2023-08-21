package javaSessions;
import java.util.ArrayList;

public class CarArrayList {

	public static void main(String[] args) {
		ArrayList  cars = new ArrayList();
		//System.out.println(cars.get(0));
		cars.add("volvo");
		System.out.println(cars.get(0));
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		cars.set(0,"Nissan");
		System.out.println(cars.size());
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);
		System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars);

		

	}

}
