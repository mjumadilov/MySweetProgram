package repl;

import java.util.Scanner;

public class R99Count {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = 0;
		// WRITE YOUR CODE HERE


for (int i = 0; i < str.length()-2; i++) {
	
	if((str.charAt(i)== str.charAt(i+1)) && 
			(str.charAt(i+1) == str.charAt(i+2))) {
		count++;
	}
}
	System.out.println(count);
	
				
		/*		for (int i = 0; i < str.length() - 2; i++) {

			if ((str.charAt(i) == str.charAt(i + 1)) && 
					(str.charAt(i + 1) == str.charAt(i + 2))) {
				count++;
			}
		}
		
		System.out.println(count);  */

	}

}
