package random;

public class JavaStringValue {

	public static void main(String[] args) {

		int value = 30;
		String s1 = String.valueOf(value);
		System.out.println(s1 + 10);  // converted to String
		
		System.out.println(value + 10);
		
		boolean bol = true;
		boolean bol1 = false;
		
		String s3 = String.valueOf(bol);
		String s2 = String.valueOf(bol1);
		System.out.println(s3);
		System.out.println(s2);

		
		
		
	}

}
