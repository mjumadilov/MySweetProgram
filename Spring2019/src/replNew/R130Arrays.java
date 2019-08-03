package replNew;
import java.util.*;
public class R130Arrays {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in) ;
	int sizeInner = scan.nextInt();
	int sizeOutter = scan.nextInt();
	int []inner = new int [sizeInner];
	int [] outter = new int [sizeOutter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
			
		}
		for (int j = 0; j < sizeOutter; j++) {
			outter[j] = scan.nextInt();
		}
		
		Arrays.sort(inner);
		Arrays.sort(outter);
		boolean aa = false;
		boolean bb = false;

		
		
		for (int x = 0; x < outter.length; x++) {
			if(outter[x] == inner[0]) {
				aa = true;
			}
		for(int y = 0; y < outter.length; y++) {
			if(outter[y] == inner[1]) {
				bb = true;
			}
		}
			
		}
		
		if(aa = true && bb == true ) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	
}
