package repl;

import java.util.*;


public class R118 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int [] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()
				
		};
		
		for (int i = 0, j = nums.length - 1; i < nums.length/2; i++, j--) {
			
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
