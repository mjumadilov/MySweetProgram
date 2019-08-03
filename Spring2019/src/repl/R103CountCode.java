package repl;

import java.util.Scanner;

public class R103CountCode {

	public static void main(String[] args) {

		int count = 0;

		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		char ch = 'c';
		char ch1 = 'o';
		char ch2 = 'e';

		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) == ch && str.charAt(i + 1) == ch1 && str.charAt(i + 3) == ch2) {
				count++;
			}
		}

		System.out.println(count);

	}

}
