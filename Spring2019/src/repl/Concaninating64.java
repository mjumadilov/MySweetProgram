package repl;

import java.util.Scanner;

public class Concaninating64 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    if (word2.charAt(0)==(word1.charAt(word1.length()-1))){
	      System.out.println (word1+ word2.substring(1,word2.length())); 
	    } 
	    else {System.out.println (word1 + word2);} 
	  }
	}
	