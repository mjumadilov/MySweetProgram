package day10;

import java.util.Scanner;

	public class TaskNew {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		
			      
	     long aN = 121212L;
	     String pw= "new";
	     
	      System.out.print("Welcome to Cybertek Banking app "+" Please enter account#:\n");
	      long accountNumber= scan.nextLong(); 
	      String password = scan.next();
	      
	if (accountNumber==aN && password.equals(pw)) {
	  System.out.println("Login Successful!");
	}else {
	  System.out.println("Login Failed!");
	}




	


	}

}
