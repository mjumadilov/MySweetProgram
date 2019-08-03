package repl;

import java.util.Scanner;

public class R101New {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int n = scan.nextInt();
		
		int i = 0;
		
		while(i < n) {
			i++;
		System.out.print(str.substring(str.length() - n));
		}
		
		
		
	}

}
