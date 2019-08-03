package CodingBat;

import java.util.Scanner;

public class In1020 {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
		boolean in1020 = true;
		int a;
		int b;
		
		System.out.println("Enter 2 numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
			System.out.println(in1020);
		}else {
			System.out.println(!in1020);
		}

		
	}

}
