package day41;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class HouseTester {

	public static void main(String[] args) {
	
		House yourHouse = new House();
		yourHouse.type = "Castle";
		yourHouse.address = "100 Mass ave, Washington DC 22001";
		yourHouse.bedrooms = 250;
		yourHouse.year = 2018;
		
		
		printHouseInfo(yourHouse);
		
		House myHouse = new House();
		myHouse.type = "Castle Hills";
		myHouse.address = "4077 N O Connor ave, Dallas TX 22001";
		myHouse.bedrooms = 10;
		myHouse.year = 2019;
		
		printHouseInfo(myHouse);
		
	House returnHouse=buildAHouse("Loft", "777 Rick rd, NY 12345", 2, 2000);
		System.out.println(returnHouse.address);
		printHouseInfo(returnHouse);
		
	}
	public static void printHouseInfo(House houseObj) {
		System.out.println("==========");
		System.out.println("Type : "+ houseObj.type);
		System.out.println("Address : "+ houseObj.address);
		System.out.println("Bedrooms # : "+ houseObj.bedrooms);
		System.out.println("Year : "+ houseObj.year);
		System.out.println("==========");

	}
	public static House buildAHouse(String type, String address, int rooms, int year) {
		House newHouse = new House();
		newHouse.type = type;
		newHouse.address = address;
		newHouse.bedrooms = rooms;
		newHouse.year = year;
		
		return newHouse;
		
	}

}
