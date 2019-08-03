package repl;

import java.util.Scanner;

public class Gooo {

	public static void main(String[] args) {

		String serviceQuality;
		
		String isSplit;
		int numberOfPeople;
		double checkAmount;
		double totalPay = 0;;
		double totalTip = 0;
		double totalPerPerson;
		double totalTipPerPerson ;
		String person = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Split:");
		
		isSplit = input.next();
		
		System.out.println("Number of people:");
		
		numberOfPeople = input.nextInt();
		
		System.out.println("Check amount:");
		
		checkAmount = input.nextDouble();
		
		System.out.println("Service Quality:");
		
		serviceQuality = input.next();

		
		for (int i = 0; i < numberOfPeople; i++) {
			person += "&";
		}
		
		if (serviceQuality.equals("Poor")) {
			totalPay = checkAmount + (checkAmount * 0.5 );
			totalTip = (checkAmount * 0.5 );
		}
		else if (serviceQuality.equals("Fair")) {
			totalPay = checkAmount + (checkAmount * 0.1 );
			totalTip = (checkAmount * 0.1 );
		}
		else if (serviceQuality.equals("Good")) {
			totalPay = checkAmount + (checkAmount * 0.15 );
			totalTip = (checkAmount * 0.15 );
		}
		else if (serviceQuality.equals("Great")) {
			totalPay = checkAmount + (checkAmount * 0.2 );
			totalTip = (checkAmount * 0.2 );
		}
		else if (serviceQuality.equals("Excellent")) {
			totalPay = checkAmount + (checkAmount * 0.25 );
			totalTip = (checkAmount * 0.25 );
		}
		
		
		if (isSplit.equals("Yes")) {
			totalPerPerson = totalPay / numberOfPeople;
			totalTipPerPerson = totalTip / numberOfPeople;
			System.out.println("Number of people entered: " + person);
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + totalTipPerPerson);
			
		}
	}
}