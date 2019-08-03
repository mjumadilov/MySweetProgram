package random;

public class JavaStringSplit3 {

	public static void main(String[] args) {

		String str = "Javatpoint";
		System.out.println("Returning words: ");
		String []arr = str.split("t",0); // splits only for 2
		for(String w: arr) {
			System.out.println(w);
		}
		
		System.out.println("Split array length " + arr.length);
		
	}

}
