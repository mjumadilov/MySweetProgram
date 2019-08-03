package frombook;

import java.util.Scanner;

public class Pg77AdditionQuiz {

	public static void main(String[] args) {
		
		int number = (int)(System.currentTimeMillis()%10);
		int number1 = (int)(System.currentTimeMillis()/7%10);
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("What is "+ number + " + " + number1 + "?");
		
		int number2 = scan.nextInt();
		
				
		
		
		System.out.println(number + " + " + number1 + " = " + " is " +
		
				(number + number1));
		

	}

}
