package replNew;

import java.util.*;

public class R146IsPos {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}
		int num = 0;
		// #2 Your code here
		for (int j = 0; j < num; j++) {
		}
	
		int j = 0;
		isPos(j);
	}

	public static void isPos(int num) {
		// #1 your code here

		for (int i = 0; i < num; i++) {
		}
		if (num <= 0) {
			System.out.println("not positive");
		} else{
			System.out.println("positive");
		}

	}

}