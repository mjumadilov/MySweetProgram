package CodingBat;

import java.util.Scanner;

public class MissingChar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str = "";
		int n = 0;
		
		System.out.println("Enter one word");
		str = scan.nextLine();
		n = scan.nextInt();
		
		String front = str.substring(0, n);
		String back = str.substring(n + 1, str.length());
		
		System.out.println(front + back);
		
	}

}
