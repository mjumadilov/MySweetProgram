package day11;

import java.util.Scanner;

public class NewFizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	Scanner scan= new Scanner(System.in);	
	int number=scan.nextInt();
	String result;
		
		
		
		result = (number %5==0) ? "fizz" : (number %3==0) ? "buzz" : "NotFizzBuzz"   ; 
		    System.out.println(result);
	}

}
