package repl;

import java.util.Scanner;

public class R91Polendrum {

	public static void main(String[] args) {
		String word;
		Scanner scan = new Scanner(System.in);

		word = scan.nextLine();
		word = word.toLowerCase().replace(" ", "");

		int length = word.length();

		String replace = "";

		for (int i = length - 1; i >= 0; i--)
			replace = replace + word.charAt(i);

		if (word.equals(replace))
			System.out.println(true);
		else
			System.out.println(false);

	}
}