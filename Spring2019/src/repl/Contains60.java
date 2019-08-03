package repl;

import java.util.Scanner;

public class Contains60 {


		public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		   // String sentence = scan.nextLine();
		    //WRITE YOUR CODE HERE

		    word = "Zuhkra";
		    boolean uExistsOrNot = word.contains("u");
		    System.out.println(word.contains("u"));
		  }
		}