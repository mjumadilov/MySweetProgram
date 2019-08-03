package repl;

import java.util.Scanner;

public class R85Vasyl {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		
		
		String summary = word;

		while(count > 1) {
					summary += separator + word;
					count--;
				}
				System.out.print(summary);
	}

}
