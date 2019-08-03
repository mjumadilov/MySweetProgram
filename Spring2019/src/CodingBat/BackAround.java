package CodingBat;

import java.util.Scanner;

public class BackAround {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// String backAroundString = "";
		// String str = "";

		System.out.println("Enter a word");
		
		String str = scan.nextLine();

		String last = str.substring(str.length() - 1);

		System.out.println(last + str + last);

	}

}
