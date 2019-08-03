package day37;

import java.util.*;

public class ETaskAkbar {

	public static void main(String[] args) {

	    // CREATE ARRAYLIST OF DOUBLE
	    // CALL IT priceList
	    // Add 5 prices
	    // try to get 3rd items
	    // iterate over arraylist using both loops
	    // and print out
	    ArrayList<Double> priceList = new ArrayList<>();
	    priceList.add(1.2);
	    priceList.add(10.12);
	    priceList.add(1.4);
	    priceList.add(1.5);
	    priceList.add(1.6);

	    System.out.println(priceList.get(2));

	    for (int i = 0; i < priceList.size(); i++) {
	      System.out.println(priceList.get(i));
	    }
	    
	    for( Double eachDouble : priceList) {
	      System.out.println(eachDouble);
	    }
	    // in another loop
	    // only print out price more than 10 ;

	  }

	}

