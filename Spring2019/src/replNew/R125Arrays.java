package replNew;

import java.util.Scanner;

public class R125Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };

		for (int i = 0; i < temps.length; i++) {
			total = total+ temps[i];
		}
	avgTemp = total/temps.length;
	
	System.out.println(avgTemp);
}}