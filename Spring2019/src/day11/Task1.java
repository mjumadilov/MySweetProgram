package day11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Enter you first number:");
		int number = scan.nextInt();
		
		if (number %3==0 && number %5==0) {
			
			System.out.println("fizz buzz");
		} else if (number %3==0) {
			
			System.out.println("buzz");
		} else if (number %5==0) {
			
			System.out.println("fizz");
		} else {
			System.out.println("Not a good number");
		}
		
		}
		

	}