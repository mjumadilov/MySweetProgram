package replNew;
import java.util.*;
public class R122ArrayLargest {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt();
		int cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows -1; i++) {
			for (int j = 0; j <= cols; j++) {
				arr[i][j] = inp.nextInt();
			}
		}
		
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
				}
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println(max);
		
	}

}
