package repl;

import java.util.Scanner;

public class R121Arrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		String reversed = "";
		
		String[]app = sentence.split(" ");	
		for(int i = app.length- 1; i >= 0; i--) {
			reversed+=app[i] + " ";
		
		}
		reversed = reversed.substring(0, reversed.length()-1);
	
			System.out.println(reversed);
	}
}