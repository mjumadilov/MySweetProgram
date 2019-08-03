package day31;

import java.util.*;

public class DCalculator {

	public static void main(String[] args) {

		
	String s = "abc";	
//	System.out.println(s.charAt(0));
	
	int[] arrObject = {1, 2, 5, 6};
	//	Arrays.sort(arr);
	
	
	arrayPrinterWithDash(new int[] {1,2,3,4,5,5,6,67 });
	
	
	
	}
	public static void arrayPrinterWithDash(int[] manyItems) {
		
		for(int each: manyItems) {
			System.out.print(each + "-");
		}
		
		System.out.println();
		
		
	}
}
