package day8;

import java.util.Scanner;

public class phoneNum {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int areaCode = inputScanner.nextInt();
		int localNumber = inputScanner.nextInt();
		
		String phoneNumber = "("+areaCode+")-"+localNumber;
		System.out.println("Calling number "+phoneNumber);

	}

}
