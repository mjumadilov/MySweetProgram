package OCApractice;

public class Print5to1 {

	public static void main(String[] args) { 
		int x =6;
		while(isAvailable(--x)){ //line 5   --x is the answer
		System.out.println(x); // 6
				// 7
		} }
		public static boolean isAvailable(int x){
		return x-- > 0 ? true:false; // 12 
	}
}