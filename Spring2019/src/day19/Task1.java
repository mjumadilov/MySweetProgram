package day19;

import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		
		String name = "";
		System.out.println("Enter a sentences");
		
		while (!name.toLowerCase().contains("java")) {

			System.out.println("What class is this ? ");
			name = scan.nextLine();

		}

		System.out.println("FINALLY , CORRECT ANSWER");

	}

}
