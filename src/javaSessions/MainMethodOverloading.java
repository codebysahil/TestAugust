package javaSessions;

public class MainMethodOverloading {
	
	public  void main() {
		System.out.println("main method 1");
	}
	
	public  void main(String a) {
		System.out.println("main method 2  " + a);
	}
   public  void main(int a) {

		
		System.out.println("this is int main method");
	}
  // jvm is calling the main method with no values and values can be passed through command line arguments
	public static void main(String[] t) {

		System.out.println(t.length);
		System.out.println(t[0]);
		System.out.println("this is jvm main method");
		MainMethodOverloading obj = new MainMethodOverloading();
		obj.main(10);
		obj.main("testing");
	}

}
