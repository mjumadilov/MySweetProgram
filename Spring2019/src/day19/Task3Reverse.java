package day19;

import java.util.Scanner;

public class Task3Reverse {

	public static void main(String[] args) {
		 System.out.println("enter the name");   
		
		 Scanner scan = new Scanner(System.in);
		 String sentence = scan.nextLine();
		
		 int x = sentence.length()-1;
		 
		 while(x>=0) {
			 System.out.print(sentence.charAt(x--) + "-");
			 
		 }
		 
		 
	}

}
