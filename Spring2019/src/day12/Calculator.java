package day12;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// ask 2 numbers from users
		//ask the operation from the user
		Scanner scan = new Scanner(System.in); 
	    
	    System.out.println("Enter 2 numbers : ");
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    
	    String operator = scan.next(); 
	    
	    if(operator.equals("+")){
	      System.out.println("the addition result is " + (num1+num2));
	    
	    }else if(operator.equals("-")){
	      System.out.println("the substarction result is " + (num1-num2));
	    
	    }else if(operator.equals("*")){
	      System.out.println("the multiplication result is " + (num1*num2));
	    
	    }else if(operator.equals("/")){
	      System.out.println("the division result is " + (num1/num2));
	    
	    }else{
	      System.out.println("INVALID OPERATOR!");
	    }
	     
	    
	    
	    

	  }

	}
