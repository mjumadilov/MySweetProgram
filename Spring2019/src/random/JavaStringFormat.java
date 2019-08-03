package random;

public class JavaStringFormat {

	public static void main(String[] args) {

		String name = "sonoo";
		
		String str1 = String.format("name is %s", name);
		String str2 = String.format("value is %f", 32.33434);
		String str3 = String.format("value is %32.12f", 32.33434);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}

}
