package day15;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a=' ';
		int charNum=0;
		
		for(int i=65;i<=122;i++)
		{
			a=(char)i;
			charNum = a;
			System.out.println("ASCII of " +a +" is " +charNum);
		}
	}

}
