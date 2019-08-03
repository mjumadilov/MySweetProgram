package repl;

import java.util.*;

public class R117 {

		 public static void main(String[] args) {
			    Scanner input = new Scanner(System.in);
			//    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
			 
			    int[] nums = {6,3,2,44,1,100,55};
			    //TODO: write your code below
			    
			    for (int i = 0, j = nums.length -1; i < nums.length/2; i++, j--){
			     
			    int tr = nums[i];
			      nums[i] = nums[j];
			      nums[j] = tr;
			  
			    }
			    
			    //Do not change below statement:
			    System.out.println(Arrays.toString(nums));
			    
			  }
			}