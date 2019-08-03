package day32;

import java.util.Scanner;

public class CTask2 {

	public static void main(String[] args) {

		
		boolean result = isAdultOrNot(19);
		System.out.println(result);
		System.out.println(isAdultOrNot(15));
		
		
	}

	public static boolean isAdultOrNot(int age) {
		
		if(age > 18) {
			return true;
		}else {
			return false;	
		}
		
		
		
		
	}
}
