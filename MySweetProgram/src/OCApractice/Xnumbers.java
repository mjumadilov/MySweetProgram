package OCApractice;

public class Xnumbers {

	public static void main(String[] args) {
		// Given the code fragment
			int x = 100;
			int a = x++;//100
			int b = ++x;//102
			int c = x++;//102
			int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x; 
			System.out.println(d);
		}
}