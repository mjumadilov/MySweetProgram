package repl;

import java.util.Scanner;

public class R85WhileDo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String separator = scan.next();
		
		int count = scan.nextInt();
		
		do {
			System.out.print(word + separator);
			count--;
		
		}while (count > 1);
		
		System.out.print(word);
			
		
		
		
	}

}
