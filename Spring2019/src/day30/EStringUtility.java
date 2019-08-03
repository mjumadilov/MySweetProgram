package day30;

public class EStringUtility {

	public static void main(String[] args) {

		reverseString("Marat");
		reverseString("Atyrgul");
		reverseString("Aileen");
		reverseString("Aisha");
		
		
	}
	public static void reverseString(String str) {

		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
}
}