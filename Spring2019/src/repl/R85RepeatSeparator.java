package repl;

import java.util.Scanner;


public class R85RepeatSeparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		String summary = word;

		for (count = 0 ; count > 1; count--) {
			count--;

			System.out.print(summary);
		}

		System.out.print(word);
		
		// summary = word;

		//while(count > 1) {
				//	summary += separator + word;
				//	count--;
				//}
				//System.out.print(summary);

		
		
		
		
	}

}
