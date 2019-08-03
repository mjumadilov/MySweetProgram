package day12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		int weather ;
		String action;
		System.out.println("What is the temperature");
		weather = scan.nextInt();
		
		action = (weather>55)? "go out" : "stay home";
		System.out.println(action);

		
		
		

	}

}
