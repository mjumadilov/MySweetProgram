package geeksforgeeks;

import java.util.Scanner;

public class ReverseWithDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sen = scan.nextLine();
		
		int word = sen.length()-1;
		
		do {
			System.out.print(sen.charAt(word));
		--word;
			
		}while(word>=0);
	}

}
