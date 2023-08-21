package wrapperClasses;

public class DataConversion {
	
	// Integer and Double are wrapper classes
	public static void main( String a[]) {
		// String to int
		String x = "100";
		System.out.println(x+20);
		int y = Integer.parseInt(x);
		System.out.println(y+20);
		//String j = "100A";
		//int k = Integer.parseInt(j);
		//System.out.println(k+20);
		//System.out.println(k);
		// String to double
		
		String s = "100.22";
		System.out.println(s+20);
		double dou=Double.parseDouble(s);
		System.out.println(dou+20);
		// int to string
		
		int total = 100;
		String st = String.valueOf(total);
		System.out.println(st+20);
		double tt=50.55;
		String t1=String.valueOf(tt);
		System.out.println(t1+20);
		
		//String to boolean
		
		

		
	}

}
