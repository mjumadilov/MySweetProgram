package ArrayList;

import java.util.ArrayList;

public class ListPractice {

	public static void main(String[] args) {

	
	ArrayList<String> lst = new ArrayList<>();
	
	lst.add("Anar");
	lst.add("Juzum");// add item
	lst.add("Almurut");
	lst.add("Alma");

	System.out.println(lst);

	System.out.println("How to get 1st item: "+ lst.get(0));
	System.out.println(lst.contains("Alma"));// if contains
	System.out.println(lst.indexOf("Alma"));// to find a location
	System.out.println("To Count the item: "+ lst.size());
	System.out.println("To check if empty: "+ lst.isEmpty());
	System.out.println("To check if empty: "+ !lst.isEmpty());
	
	lst.set(1, "Oruk"); // replace the excisted item
	System.out.println(lst);
	
	lst.remove(0);
	lst.remove("Almurut");// remove item
	System.out.println(lst);
	
	lst.clear();
	System.out.println(lst);
	
		
	
	

	
	
	}

}
