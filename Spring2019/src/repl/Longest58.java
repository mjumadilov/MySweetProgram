package repl;

import java.util.Scanner;

public class Longest58 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    
		    int count1 = word1.length();
		    int count2 = word2.length();
		    
		    if(count1 > count2)
		    	System.out.println(word1);
		    else 
		    	System.out.println(word2);
	}

}
