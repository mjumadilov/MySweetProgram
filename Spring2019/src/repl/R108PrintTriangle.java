package repl;

import java.util.Scanner;

public class R108PrintTriangle {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String print = "";
		
		for(i = 1; i <= n; i++) {
		
			print = print.concat("*");
		
			System.out.println(print);	
			
		} 
	
	
	
	}

}
