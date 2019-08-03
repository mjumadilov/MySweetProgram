package day42;

import java.util.ArrayList;

public class HFamilyAction {

	public static void main(String[] args) {

		
		HFamily dad = new HFamily();
		dad.name = "Marat";
		dad.age = 32;
		dad.gender = "male";
		dad.action ="studying";
		dad.height = 178.2;
		dad.weight = 140;
		
		HFamily mom = new HFamily();
		mom.name = "Atyrgul";
		mom.age = 30;
		mom.gender = "female";
		mom.action = "reading";
		mom.height = 165.0;
		mom.weight = 120;
		
		HFamily daughter1 = new HFamily();
		daughter1.name = "Jamelia Aileen";
		daughter1.age = 2;
		daughter1.gender = "female";
		daughter1.action = "playing";
		daughter1.height = 60.0;
		daughter1.weight = 30;
		
		HFamily daughter2 = new HFamily();
		daughter2.name = "Aisha Nur";
		daughter2.age = 1;
		daughter2.gender = "female";
		daughter2.action = "sleeping";
		daughter2.height = 30.3;
		daughter2.weight = 13;
		
		ArrayList<HFamily>myFamily = new ArrayList<>(); 
		myFamily.add(daughter2);
		myFamily.add(daughter1);
		myFamily.add(dad);
		myFamily.add(mom);
		
		for (int i = 0; i < myFamily.size(); i++) {
			HFamily each = myFamily.get(i);
			each.printFamilyInfo();
		}
		
		System.out.println("======age=====");
		for (int i = 0; i < myFamily.size(); i++) {
			HFamily each = myFamily.get(i);
			if(each.age < 3) {
				each.printFamilyInfo();	
			}
		
	}
		System.out.println("=======gender======");	

		for (int i = 0; i < myFamily.size(); i++) {
			HFamily each = myFamily.get(i);
			if(each.gender.equalsIgnoreCase("Female")) {
				each.printFamilyInfo();	
			}
}
}
}