package day30;

import java.util.Scanner;

public class BUtility {

	public static void main(String[] args) {

		
		for (int i = 1; i < 4; i++) {
			printUsersName();
System.out.println(i + "- Spartan");
		}
		
		
	}
	
	public static void printUsersName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please: ");
		
		String name = scan.next();
		System.out.println("You entered : "+ name);
		
	}

}
