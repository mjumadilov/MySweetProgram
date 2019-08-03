package day29;

import java.util.Arrays;

public class BMultiDArrayReview {

	public static void main(String[] args) {
		

		
		int [] nums = {1,45,32,10};
		int [] nums2 = {2,5,31};
		
		
		int [] numsOfNum[] = new int [2][];
		System.out.println(Arrays.deepToString(numsOfNum));
		
		numsOfNum[0] = nums;
		numsOfNum[1] = nums2;
		
		System.out.println(Arrays.deepToString(numsOfNum));
		
	}

}
