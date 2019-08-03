package repl;

import java.util.Scanner;

public class R84Factorials {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long number = scan.nextLong();
		long x = 1;
		
		do {
			x = x * number;
		number--;
		}while (number > 1);
		System.out.println(x);
		
		
	}

}
