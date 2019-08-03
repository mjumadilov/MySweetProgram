package repl;

import java.util.Scanner;


public class LastCharacter {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		 
		 System.out.println(" ");
			
			//word= scan.nextLine();
			int lastIndex = word.length()-1;
			System.out.println(word.charAt(lastIndex));
			
			}

		}