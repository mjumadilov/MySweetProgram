package day20;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		// Task 1 :

		// print our name char by char using do while loop
		// Hurma --> H u r m a
		// use do while loop

		String fUp = name.substring(0, 1).toUpperCase();
		String expected = fUp + name.substring(1);

		System.out.println(expected);
		char c = name.charAt(0);

		System.out.println(name.charAt(0) + "" + name.substring(1));

	}

}
