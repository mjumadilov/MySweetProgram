package random;

public class WrappedClass {

	public static void main(String[] args) {

		int a = 20;
		
		Integer i = Integer.valueOf(a);
		
		Integer j = i;
		
		System.out.println(a +" "+ i +" "+ j);
		
		
		Integer g  = new Integer(3);
		
		int h = g.intValue();
		int f = h;
		
		System.out.println(g +" "+ h +" "+ f);
		
	}

}
