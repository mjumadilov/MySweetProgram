package day27;

public class DForEachLoop {

	public static void main(String[] args) {

		
		int [] nums = {1, 33, 567, 11, 22 };
		
		for (int i = 0; i < nums.length; i++) {
			int eachItem = nums[i];
			System.out.print(eachItem + ", ");
			
		}
 		System.out.println();
		for(int eachItem : nums) {
			System.out.print(eachItem + " - ");
		}
		
	}

}
