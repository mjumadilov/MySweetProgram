package geeksforgeeks;

import java.util.Scanner;

public class ForLoopArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean mixStart = true;
		String str;

		System.out.println("Enter a word");
		str = scan.nextLine();

		if (str.length() < 3) {

			System.out.println(!mixStart);}

			
		String two = str.substring(1, 3);
	
		if (two.equals("ix")) {
			System.out.println(mixStart);
		}else {
			System.out.println(!mixStart);
		}

	}

}