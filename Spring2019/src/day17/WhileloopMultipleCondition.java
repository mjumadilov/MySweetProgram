package day17;

import java.util.Scanner;

public class WhileloopMultipleCondition {

	public static void main(String[] args) {
		

		Scanner scan= new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num = scan.nextInt();
		
		int x = 1;

		while(x<=num) {
		System.out.print(x+", ");
		x++;
		}
		
		
	}

}
