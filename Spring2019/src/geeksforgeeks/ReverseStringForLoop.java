package geeksforgeeks;

import java.util.Scanner;

public class ReverseStringForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sen = scan.nextLine();
		
	//	int word = sen.length()-1;

		for (int i = 0; i < sen.length(); i++) {
			
			System.out.print(i.charAt(i));

		}
		
	}

}
