package javaSessions;

public class Test {
	
	public String giveSecretCode() {
		return "12";
	}

	public static void main(String[] args) {
		
        Test t = new Test();
      String s=  t.giveSecretCode();
	}

}
