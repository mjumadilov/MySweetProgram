package day21;

import java.util.Scanner;

public class TaskOneMIne {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int  num1, num2, sum;
		
		System.out.println("Enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		sum = num1+num2;
		if(sum == 100) {
			System.out.println("Good job");
		}else if (sum !=100) { 
			System.out.println("Try again");
		}
		
		
		
	}

}
