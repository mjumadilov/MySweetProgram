package day24;

import java.util.Arrays;

public class CountingItemInside {

	public static void main(String[] args) {

		int[] nums = { 1, 55, 7, 898, 9, 55 };

		// String str = Arrays.toString(nums) ;

		System.out.println(Arrays.toString(nums));
		int count = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 100) {
				count += nums[i];
			}
		}

		System.out.println(count);

	}

}
