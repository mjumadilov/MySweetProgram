package CodingBat;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		boolean negative = true;
		Scanner scan= new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		if( a < 0 && b < 0) {
			System.out.println(negative);
		}else {
			System.out.println(!negative);
		}
		
		
	}

}
