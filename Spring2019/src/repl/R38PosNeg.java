package repl;

import java.util.Scanner;

public class R38PosNeg {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	   
	    //CODE HERE 
	    
	    if (number > 0) {
	    	System.out.println(number + " is positive");
	    }
	    if(number < 0) {
	    	System.out.println(number +" is negative");
	    }
	    if(number == 0 ) {
	    	System.out.println("it is zero");
	    }
	    
	    
	  }
	}