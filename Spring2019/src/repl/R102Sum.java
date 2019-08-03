package repl;

import java.util.Scanner;

public class R102Sum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int sum = 0;
		
		int s = str.length()-1;
		
		for(int i = 0; i <= s; i++) {
			
			if(Character.isDigit(str.charAt(i)))
			{
				sum = sum + Integer.parseInt(str.substring(i, i + 1));
			}
		}
		
		System.out.println(sum);
	}

}
