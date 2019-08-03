package day37;

import java.util.*;

public class ETask {

	public static void main(String[] args) {

		
		ArrayList<Double> priceList = new ArrayList<Double>();		
		
		priceList.add(12.5);
		priceList.add(11.0);
		priceList.add(10.3);
		priceList.add(18.9);
		priceList.add(11.2);
		
		
		System.out.println(priceList.get(2));
		for (int i = 0; i < priceList.size(); i++) {

			System.out.println(priceList.get(i));
			}
			
		for (Double eachDouble: priceList) {
			System.out.println(eachDouble);
		}
		
		}
		
		
	}


