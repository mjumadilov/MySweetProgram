package repl;

import java.util.Scanner;

public class ReverseString76 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String sentence = scan.nextLine();
		   
		 int x = sentence.length()-1;
		 
		 while(x>=0) {
			 System.out.print(sentence.charAt(x));
			 --x;
		 }
		 
		 
	}

}
