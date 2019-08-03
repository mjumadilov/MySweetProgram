package CodingBat;

import java.util.Scanner;

public class HasTeen {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		boolean teen = true;
		
		System.out.println("Enter 3 numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if((a >= 13 && a <= 19) || (b>=13 && b<=19)||(c>= 13 && c<=19)){
			System.out.println(teen);
		}else {
			System.out.println(!teen);
		}

	}

}
