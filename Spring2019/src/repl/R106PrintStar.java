package repl;

import java.util.Scanner;

public class R106PrintStar {

	public static void main(String[] args) {

		int j = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (j = 0; n > j; j++) {

			System.out.print("*");

		}

	}
}
