package replNew;

import java.util.*;

public class R128Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		int size = scan.nextInt();
		int [] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		
		int [] numm = new int [nums.length*2]; 		
		numm [numm.length - 1] = nums[nums.length - 1];
		
		System.out.println(Arrays.toString(numm));
	}

}
