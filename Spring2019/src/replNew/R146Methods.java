package replNew;

import java.util.*;

public class R146Methods {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		
		int[]arr = new int[size];
		for (int i = 0; i < size-1; i++) {
			arr[i] = inp.nextInt();
		}
		for (int j = 0; j <= size-1; j++) {
			isPos(arr[j]);	
		}
		
		
	}

	public static void isPos(int num) {
		
		String a = "positive";
		
		if(num > 0) {
			a = "positive";
		}else {
			
			a = "not positive";
		}
		
	}
}
