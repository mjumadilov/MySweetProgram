package day28;
import java.util.*;
public class EForEachLoopModifyItem {

	public static void main(String[] args) {

		int a = 10;
		int b = a;
		b = 20;
		
		System.out.println(a + b);
		
		int [] arr = {1,2,4,6,3};
		
		for (int k = 0; k < arr.length; k++) {
			int eachItem = arr[k];
			eachItem = 20;
		}
		System.out.println(Arrays.toString(arr));
	}

}
