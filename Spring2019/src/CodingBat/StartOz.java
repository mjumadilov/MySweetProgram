package CodingBat;

import java.util.Scanner;

public class StartOz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		String str;
		System.out.println("Enter a word");
		str = scan.nextLine();
		
		if(str.length() >= 1 && str.charAt(0) == 'o') {
			System.out.print(result + str.charAt(0));
		}
		if(str.length() >= 2 && str.charAt(1) == 'z') {
			result = result + str.charAt(1);
		}
		
		System.out.print(result);
		
	}

}
