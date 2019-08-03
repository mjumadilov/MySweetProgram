package day39;

public class EHorse {

		String breed;
		int age;
		String color;
		double height;
		
		public static void main(String[] args) {
			
			EHorse h1 = new EHorse();
			h1.age = 4;
			h1.breed = "kyrgyz horse";
			h1.color = "black";
			h1.height = 5.10;
			
			EHorse h2 = new EHorse();
			h2.age  = 5;
			h2.breed = "arabian";
			h2.color = "grey";
			h2.height = 5.11;
			
			System.out.println(h1.color);
			System.out.println(h2.height);
			
		}
		
}
