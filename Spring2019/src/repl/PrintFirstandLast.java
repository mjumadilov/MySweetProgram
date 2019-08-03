package repl;

import java.util.Scanner;

public class PrintFirstandLast {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
		 char firstChar = word.charAt(0); 	
		 int lastIndex = word.length()-1;
			System.out.print(firstChar);
			System.out.println((word.charAt(lastIndex)));
	
		
		
		
		
		
	}

}
