package repl;

import java.util.Scanner;


public class R97PrintLetter {

	public static void main(String[] args) {

		System.out.println("Enter the letter");
		
		Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		   
	for (char i = start; i <= end; i++) {
		
		String s1 = String.valueOf(i);

		System.out.print(s1);
	
		//System.out.print(i+ " ");
	}	
	

	}
	}


