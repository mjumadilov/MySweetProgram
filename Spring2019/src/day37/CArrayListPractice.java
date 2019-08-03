package day37;

import java.util.*;

public class CArrayListPractice {

	public static void main(String[] args) {

		
		
		ArrayList<String> lst1 = new ArrayList<>();
		
		List<String> lst2 = new ArrayList<>();
		
		lst1.add("Marat");
		lst1.add("Atyrgul");
		lst1.add("Aileen");
		lst1.add("Aisha");
		
		System.out.println(lst1);
		
		System.out.println("Dad of our house : "+ lst1.get(0));
		System.out.println("Mom of our house : "+ lst1.get(1));
		System.out.println("Daughter #1 : "+ lst1.get(2));
		System.out.println("Daughter #2 : "+ lst1.get(3));
		
		int count = lst1.size();
		System.out.println(count);


		for (int i = 0; i < 4; i++) {
		//	System.out.println("family member: "+(i+1)+ "-"+lst1.get(i));
			
			System.out.println(lst1.get(i));
	
		}
	}

}
