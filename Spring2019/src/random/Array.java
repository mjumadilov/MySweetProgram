package random;

public class Array {

	public static void main(String[] args) {

		
		int [] a = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+", ");
			
			
		}
		System.out.println();
		
		
		int  b []= {10, 20, 30, 40, 50};
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+ "-");
		}
	
	}

}
