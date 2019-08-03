package CodingBat;

import java.util.Scanner;

public class NotString {

	public static void main(String[] args) {

		String notString ="";
		String str = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word");
		str = scan.nextLine();
		
		if(str.length() >= 3 && str.substring(0, 3).equals("not")) {
			System.out.println(str);
		}else {
			System.out.println("not "+ str);
		}
		
		
	}

}
