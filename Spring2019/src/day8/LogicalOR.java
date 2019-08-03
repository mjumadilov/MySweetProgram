package day8;

public class LogicalOR {

	public static void main(String[] args) {
		System.out.println(true|| true);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(false||false);
		
		boolean bool;
		String drink  = "tea";
		boolean hot = true;
		boolean free = true;
		
		bool = 4 > 10 || 4<5;
		System.out.println(bool);
		bool = drink.equals("tea")|| drink.equals("coffee");
		System.out.println(bool);
		bool = drink.equals("tea")| drink.equals("coffee");
		System.out.println(bool);
		
	}

}
