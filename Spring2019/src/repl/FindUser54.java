package repl;

import java.util.Scanner;


public class FindUser54 {

	public static void main(String[] args) {
		
		
	
		Scanner scan= new Scanner(System.in);
		
		String name;
		
		System.out.println("Enter full name:");
		name = scan.nextLine();
		
		if(name.equalsIgnoreCase("Max Payne")||name.equalsIgnoreCase("Alan Wake"))
				{
			
			System.out.println("Usef found!");
		} else {	System.out.println("User not found!");
			
		}
		
		
		
	}

}
