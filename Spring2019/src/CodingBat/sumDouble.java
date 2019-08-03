package CodingBat;

import java.util.Scanner;

public class sumDouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 0; 
		int b = 0;
		
		System.out.println("Enter two integers");
		
		a = scan.nextInt();
		b = scan.nextInt();
		int sum = a + b;

		if(a == b) {
			sum = sum*2;
			System.out.println(sum);
		}else {
			System.out.println(sum);
		}
		
		
	}

}
