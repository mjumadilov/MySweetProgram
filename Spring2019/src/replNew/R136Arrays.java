package replNew;

import java.util.*;

public class R136Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    //WRITE YOUR CODE HERE
	    
	    for(int i =1; i<=nums.length-1; i++ )
	    nums[i-1]=nums[i];
	    
	  }
	}