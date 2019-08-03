package repl;

import java.util.Scanner;

public class MiddleThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  
		String word = scan.next();
		
		int count = word.length();
		int midPoint = count/2;
		
		if(count >= 5 && count%2 !=0) {
			
			System.out.println(word.substring(midPoint-1, midPoint+2));
		}else {
			System.out.println("invalid");
		}
		
		   
	  }
	}