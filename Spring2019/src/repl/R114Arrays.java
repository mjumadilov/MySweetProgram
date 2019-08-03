package repl;

import java.util.*;

public class R114Arrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt() };
	
	boolean real = false;
	for (int i = 0; i < nums.length - 1; i++) {
		if(nums[i] == 5 && nums[i + 1] == 5) {
			real = true;
		}
	}
	System.out.println(real);
	
	}

}
