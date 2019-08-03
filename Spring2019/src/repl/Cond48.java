package repl;

import java.util.Scanner;

public class Cond48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
			//WRITE YOUT CODE HERE
			
			int condition = (x>=5)? x : -x;
			System.out.println(condition);
			
			
	}

}
