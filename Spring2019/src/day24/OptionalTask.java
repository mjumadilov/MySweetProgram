package day24;

public class OptionalTask {

	public static void main(String[] args) {

		
		int nums []= {1,4,6,8,9};
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	
	   System.out.println();
	    
		int temp = nums[nums.length-1];
		
		nums[nums.length-1] = nums[0];
		
		nums[0] = temp;
		
		for (int i = 0; i < nums.length; i++) {
		      System.out.print( nums[i] + " ");

		}
		
		
		
		
	}

}
