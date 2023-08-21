package javaSessions;

import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {

		
		int i[] = new int[4];
		int len = i.length;
		System.out.println("lenght of the array is : " + len);
		System.out.println("The highest index is : " + (len-1));
		System.out.println("lowest index is :" + 0);
		
		i[0] = 10;
		i[1] = 11;
		i[2] = 12;
		i[3] = 13;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println("sum of all the elements is:  "  + (i[0]+i[1]+i[2]+i[3]));
		//System.out.println(i[-1]); //AIOB
        //System.out.println(i[4]); // AIOB	
        
		 System.out.println("--------------------------------------");
        int k[] = new int[3];  // only segment creation
        System.out.println(k[0]);
        System.out.println("--------------------------------------");
        k[0] = 100;
        k[2] = 200;
        System.out.println(k[0]);
        System.out.println(k[1]);
        System.out.println(k[2]);
        
        int marks[] = new int[4];
        marks[0] =10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        for(int in =0;in<=marks.length-1;in++) {
        	System.out.println("the marks are: " + marks[in]);
        	
        }
        
        System.out.println(marks); // do not print the array variable directly
        // to list the content of the array use the Arrays.toString("array name") 
        System.out.println("the content of the array is : " + Arrays.toString(marks));
        
       // arrays of data type byte 
       byte b[] = new byte[4];
       short s[] = new short[2];
       
       // array of data type double
       
	}

}
