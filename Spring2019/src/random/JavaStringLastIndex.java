package random;

public class JavaStringLastIndex {

	public static void main(String[] args) {
				// 012345678911234	
		String s1 = "this is last index of example";
		int index1 = s1.lastIndexOf("of");
		
		System.out.println(index1);
		
		int index = s1.lastIndexOf('h',5);
		
		System.out.println(index);
	}

}
