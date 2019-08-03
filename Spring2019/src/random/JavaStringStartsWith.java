package random;

public class JavaStringStartsWith {

	public static void main(String[] args) {

		String s1 = "java string split method by javatpoint";
		
		System.out.println(s1.startsWith("je"));
		System.out.println(s1.startsWith("java string"));
				  // 01234
		String s2 = "Javatpoint";
		
		System.out.println(s2.startsWith("J"));
		System.out.println(s2.startsWith("a"));
		System.out.println(s2.startsWith("t",4));  // t is 4th index
		
	}

}
