package CodingBat;

import java.util.Scanner;

public class Diff21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter an integer");
		n = scan.nextInt();
		if(n <= 21) {
			System.out.println(21 - n);
		}else {
			System.out.println((n- 21)*2);
		}
		
		
		
	}

}
