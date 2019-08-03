package day11;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter your number");
		Scanner scan = new Scanner(System.in);
		int number;
		String result;
		
		number = scan.nextInt();
		
		result = (number%3==0&& number%5==0)? "FizzBuzz" : "NotFizzBuzz";
		System.out.println(result);
		
		 
	}

}
