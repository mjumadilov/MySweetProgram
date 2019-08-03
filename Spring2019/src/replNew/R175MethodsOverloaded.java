package replNew;

import java.util.*;

public class R175MethodsOverloaded {
	// WRITE YOUR CODE HERE
	public static int findMax(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;

	}

	public static double findMax(double[] nums) {
		double max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
}