package day9;

import java.util.Scanner;

//import com.sun.tools.javac.comp.Enter;

public class WarmUp2 {

	public static void main(String[] args) {
		
		int num1, num2, sum;

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		 num1 = scanner.nextInt();
		 num2 = scanner.nextInt();
				
		/*		{} - - curly braces
		 * 		[] - - square bracket
		 * 		() - - parenthesis 
		 * 		Logical Operator &&, &, ||, |, !
		 * 		&& - And it will not evaluate righthand side if left handside is false
		 * 		& - - And it will always check both side
		 * 		|| - - OR it will only evaluate right hand side if left hand side is false
		 * 		|	-	-	OR it will always evaluate both side. 
		 * 		!	-	-	Logical not
		 * */
		sum = num1 + num2;
		
		if (sum > 100) {
			System.out.println("Good number");
		}else {
			System.out.println("Your number look like equal or small to 100");
		}
		 
		 
	}

}
