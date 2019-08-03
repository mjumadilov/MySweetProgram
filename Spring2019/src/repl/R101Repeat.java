package repl;

import java.util.Scanner;

public class R101Repeat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		
		String last = str.substring(str.length()-n);
		
		for(int i = 0; i < n; i++) {
			System.out.print(last);
		}
	}

}
