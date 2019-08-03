package day31;

import java.util.Scanner;

public class FCalculatorWithScanner {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		add(a, b);		
		subs(a, b);		
		mult(a, b);		
		div(a, b);		
		mod(a, b);		

		
		
	}
	public static void add(int a, int b) {
		System.out.println("The result is  "+(a + b));
	}
	
	public static void subs(int a, int b) {
		System.out.println("The result is  "+ (a - b));

	}
	public static void mult(int a, int b) {
		System.out.println("The result is  "+(a * b));

	}
	public static void div(int a, int b) {
		System.out.println("The result is  "+(a / b));

	}
	public static void mod(int a, int b) {
		System.out.println("The result is  "+(a % b));

	}
}