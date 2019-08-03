package day15;

public class CastingPrimatives {

	public static void main(String[] args) {
		//char, boolean 
		//byte, short, int, long, float, double
		//type conversion - - casting
		// byte --> int upcasting/type widening
		byte b = 12;
		int i = b;
		int y = (int)b;
		// int --> byte downcasting/ type narrowing
		
		int a =20;
		byte c = (byte) a;
		
		
		double d = 12.12;
		int k = (int) d;
		
		System.out.println(k);
		
		
		char c1 = 'A';
		int cNum = c1;
		System.out.println(cNum);
		
	}

}
