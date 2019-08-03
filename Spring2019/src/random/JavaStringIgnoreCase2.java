package random;

import java.util.ArrayList;

public class JavaStringIgnoreCase2 {

	public static void main(String[] args) {

		String str1 = "Jamelia Aileen";
		
		ArrayList<String>list = new ArrayList<>();
		
		list.add("Aisha");
		list.add("Aileen");
		list.add("Jamelia AILEEN");
		list.add("Nur");
		list.add("Marat");
		for(String str: list) {
			if(str.equalsIgnoreCase(str1)) {
				System.out.println("JAMELIA is present");
			}
		}
		
		
	}

}
