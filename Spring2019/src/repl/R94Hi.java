package repl;

import java.util.Scanner;

public class R94Hi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		String str = scan.nextLine();
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
