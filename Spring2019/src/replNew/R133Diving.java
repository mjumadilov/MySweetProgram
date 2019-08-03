package replNew;

import java.util.*;

public class R133Diving {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float[] score = new float[7];

		// WRITE YOUR CODE HERE
		float sum = 0;
		float max = score[0];
		for (int i = 0; i < score.length; i++) {
			System.out.println("Enter score for judge " + (i + 1) + ":");
			score[i] += input.nextFloat();
			if (score[i] > max) {
				max = score[i];

			}

		}
		float min = max;

		for (int i = 0; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];

			}
		}
		System.out.println("Enter difficulty:");
		float difficulty = input.nextFloat();
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		sum -= max + min;
		float total = sum * difficulty * 0.600f;
		// FINAL OUTPUT
		System.out.printf("Total: %4.2f", total);
	}
}
