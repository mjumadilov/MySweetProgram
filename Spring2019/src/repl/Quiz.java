package repl;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    System.out.println("Enter your answer:");
	    String a = s.nextLine();
	    
	    //your code here
	    if(a.contentEquals("a")){
	    	System.out.println("a is wrong");
	    }
	   
	    else if (a.contentEquals("b")){
	    	System.out.println("b is correct");
	    }
	   
	    else if(a.contentEquals("c")){
	    	System.out.println("c is wrong");}
	    
	   
	    else {
	    	System.out.println(a+ " is not a valid answer");}
	    
	  }
	}