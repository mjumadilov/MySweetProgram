package day27;

import java.util.*;

public class GTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = 0;

		System.out.println("Enter 5 numbers");

		int num[] = { scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), };
		
		System.out.println(Arrays.toString(num));
		int max = num[0];
		int min = num[0];

		for (int num1 : num) {
			sum += num1;

			if (num1 > max)
				max = num1;
			if (num1 < min)
				min = num1;

		}
		System.out.println("Sum is - " + sum);
		System.out.println("Max number is - " + max);
		System.out.println("Min number is -" + min);

	}

}
