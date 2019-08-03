package day27;

import java.util.*;

public class FForEachPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word;
		System.out.println("enter your name");
		word = scan.nextLine(); 
	    char[] newChars = word.toCharArray() ; 

	    for(char last: newChars) {
			 System.out.print(last + ", "); 
		
	}
	}
}
