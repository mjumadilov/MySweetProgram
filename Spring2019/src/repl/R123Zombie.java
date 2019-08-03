package repl;

import java.util.Arrays;
import java.util.Scanner;

public class R123Zombie {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		int day = 0;
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		
		boolean allGone = true;
		System.out.println("Day "+ day++ + " "+ Arrays.toString(inhabitants));
		
		do {
			for (int i = 0; i < inhabitants.length; i++) {
				allGone = true;
				inhabitants[i] /= 2;
			}
			System.out.println("Day "+ day++ + " "+ Arrays.toString(inhabitants));
			for (int j = 0; j < inhabitants.length; j++) {
				if(inhabitants[j] > 0) {
					allGone = false;
				}
			}
		}while(!allGone);
		
		System.out.println("---- EXTINCT ----");
	}

}
