package replNew;

public class R165Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String mergeStrings(String one, String two) {

	String str = "";
	
	int a = one.length();
	int b = two.length();
	
	String shortOne = "";
	String longOne = "";
	
	if(a<b) {
		shortOne = one;
		longOne = two;
		
	}else {
		shortOne = two;
		longOne = one;
		
	}
	int c = shortOne.length();
	for (int i = 0; i < c; i++) {
		if(c==b) 
			str = str+longOne.charAt(i)+shortOne.charAt(i);
			else if(c==a) 
				str = str+shortOne.charAt(i)+longOne.charAt(i);

			}
			str = str+longOne.substring(c);
			return str;
		
	}
	
	}
