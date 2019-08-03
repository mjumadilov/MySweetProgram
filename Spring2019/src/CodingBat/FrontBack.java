package CodingBat;

import java.util.Scanner;

public class FrontBack {

	public static void main(String[] args) {

		String str = "";
		String frontBack = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word");
		str = scan.nextLine();
		
		String mid = str.substring(1, str.length()-1);
		
		if(str.length() <= 1) {
			System.out.println(str);}
		else {
			System.out.println(str.charAt(str.length()-1) + mid + str.charAt(0));
		}
		
		
	}

}
