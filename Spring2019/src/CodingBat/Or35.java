package CodingBat;

import java.util.Scanner;

public class Or35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		boolean or35 = true;
		
		System.out.println("Enter a number");
		n = scan.nextInt();
		
		if(n % 3 ==0 || n % 5 == 0) {
			System.out.println(or35);
		}else {
			System.out.println(!or35);
		}
		
		
		
		
	}

}
