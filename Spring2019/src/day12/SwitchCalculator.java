package day12;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		
		
				Scanner scan= new Scanner(System.in);

				int num1=scan.nextInt();
				int num2=scan.nextInt();
				
				String operator= scan.next();
			
				switch(operator) {
				case "/":
					System.out.println("The result is " + (num1/num2));
					break;
					
				case "+":
					System.out.println("The result is " + (num1+num2));
					break;
				case "*":
					System.out.println("The result is " + (num1*num2));
					break;
				case "-":
					System.out.println("The result is " + (num1-num2));
					break;
				
				default:
					System.out.println("invalid number");
					break;
					}

				
	}

			}
		
		
		
		
		
		
		
	


