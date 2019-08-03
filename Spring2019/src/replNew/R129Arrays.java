package replNew;

import java.util.*;

public class R129Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
			
			
		}
		
		if(num.length > 1) {
			int [] numm = new int [2];
			numm[0] = num[0];
			numm[1] = num[1];
			
			System.out.println(Arrays.toString(numm));
				
		}else if(num.length == 1) {
			int [] numm = new int[1];
			numm[0] = num[0];
			System.out.println(Arrays.toString(numm));
		}
		
		
		
	}

}
