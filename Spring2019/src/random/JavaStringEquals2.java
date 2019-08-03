package random;

public class JavaStringEquals2 {

	public static void main(String[] args) {

		String s1 = "javatpoint";
		String s2 = "javatpoint";
		String s3 = "javatpoint";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		if(s1.equals(s3)) {
			System.out.println("both strings are equal");
		}else {
			System.out.println("both strings are unequal");
		}
		
	}

}
