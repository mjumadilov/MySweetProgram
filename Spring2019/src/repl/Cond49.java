package repl;

import java.util.Scanner;

public class Cond49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
	//if (num1 > num2) {
	//	System.out.println(num1);
	//} else {
	//	System.out.println(num2);
	//}
	
			
	int condition = (num1>num2)? num1:num2;	
		System.out.println(condition);
	}

}
