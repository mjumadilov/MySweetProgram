package random;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(num >= 0) {
					System.out.println("positive");
				}else if (num < 0){
					System.out.println("not positive");

				}
		}
		
	}

}
}