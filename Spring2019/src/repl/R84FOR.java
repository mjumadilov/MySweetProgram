package repl;

import java.util.Scanner;

public class R84FOR {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		long n = scan.nextLong();
		long x = 1;
		
		for( x = 1; n > 1; n--) {
			
			System.out.println(x = x * n);
			//n--;
		}
		
		
		/*long number = scan.nextLong();
		long x = 1;
		
		do {
			x = x * number;
		number--;
		}while (number > 1);
		System.out.println(x);
*/
		
		
	}
}
