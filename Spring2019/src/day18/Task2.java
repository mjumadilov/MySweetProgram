package day18;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		
		Scanner scan= new Scanner(System.in);
		
		int x = 0;
		
		while(x != 5 && x !=10) {
			
			System.out.println("Enter your bill ");
			x = scan.nextInt();
		}
		
		System.out.println("You entered $" + x);
		
		
		
	}

}
