package repl;

import java.util.Scanner;

public class ReplHelpUulkan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Grader!");

		String subject1, subject2, subject3, subject4, summary;
		Float grade1, grade2, grade3, grade4, average;

		System.out.println("Please enter subject name number1 and score for this subject");

		subject1 = scan.next();
		grade1 = scan.nextFloat();

		System.out.println("Please enter subject name number2 and score for this subject");

		subject2 = scan.next();
		grade2 = scan.nextFloat();

		System.out.println("Please enter subject name number3 and score for this subject");

		subject3 = scan.next();
		grade3 = scan.nextFloat();

		System.out.println("Please enter subject name number4 and score for this subject");

		subject4 = scan.next();
		grade4 = scan.nextFloat();

		//summary = scan.next();
		summary = (subject1 + "-" + grade1 + ", " + subject2 + "-" + grade2 + ", " + subject3 + "-" + grade3 + ","
				+ subject4 + "-" + grade4);
		System.out.println("Summary:" + summary);

		average = ((grade1 + grade2 + grade3 + grade4) / 4);
		
		float average2 = (int)Math.round(average*100)/(float)100;
		
		System.out.println("Your average score is: " + average2);

		System.out.println("Thank you for using Grader!");
		System.out.println("Goodbye!");

	}

}
