package random;

public class JavaStringIndexOf2 {

	public static void main(String[] args) {

		String s1 = "This is indexOf method";
		
		int index = s1.indexOf("method");
		
		System.out.println("index of substring "+ index);
		
		int index1 = s1.indexOf("method", 20);
		
		System.out.println("index of substring "+ index1);
		
		
	}

}
