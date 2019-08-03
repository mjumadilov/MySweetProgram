package random;

public class JavaStringReplace {

	public static void main(String[] args) {

		String s1 = "javatpoint is a very good website";
		
		String replaceString = s1.replace('i', 'e');
		
		System.out.println(replaceString);
		
		String replaceString2 = s1.replace("is", "was");
		System.out.println(replaceString2);
		
		
	}

}
