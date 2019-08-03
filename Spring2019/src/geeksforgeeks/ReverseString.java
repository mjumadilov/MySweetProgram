package geeksforgeeks;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sen = scan.nextLine();
		
		int word = sen.length()-1;
		while(word>=0) {
			System.out.print(sen.charAt(word));
		--word;
		}
		
		
	}

}
