package day11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		System.out.println("enter the numbers");
		int one, two;
		
		Scanner number = new Scanner(System.in);
		
		int score = number.nextInt();
		String result = "Result";
		
		
		if (score >= 75) {
		System.out.println("Pass");
		System.out.println(result + " is " + score);
		} else {
			System.out.println("fail");
		}

	}

	
		
		
	}


