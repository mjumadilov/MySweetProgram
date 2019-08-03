package day41;
import java.util.*;


public class HouseBoulder {

	public static void main(String[] args) {

		House house1 = new House();
		house1.bedrooms = 3;
		house1.type = "Town House";
		house1.address = "123 Main st, Sterling VA 22222";
		house1.year = 2010;

		House house2 = new House();
		house2.bedrooms = 3;
		house2.type = "Single House";
		house2.address = "3212 Lee highway Apt 22, Irving VA 22222";
		house2.year = 2014;

		House house3 = new House();
		house3.bedrooms = 132;
		house3.type = "Condominium";
		house3.address = "2434 K st NW Apt 543, Washington DC 22222";
		house3.year = 2014;

		House whiteHouse = new House();
		whiteHouse.bedrooms = 132;
		whiteHouse.type = "Mansion";
		whiteHouse.address = "1600 Pensilvania ave NW Washington DC 22222";
		whiteHouse.year = 1800;

		System.out.println("House1 Type ---> " + house1.type);
		System.out.println("House2 Type ---> " + house2.type);
		System.out.println("House3 Type ---> " + house3.type);
		System.out.println("WhiteHouse Type ---> " + whiteHouse.type);

		int[] nums = new int[4];
		nums[0] = 234;

		String[] names = new String[4];
		names[0] = "Bill";
		House esqersHouse = new House();
		esqersHouse.type = "TownHouse";
		esqersHouse.address = "4312 JOhn Street, Dallas TX";
		esqersHouse.bedrooms = 3;
		esqersHouse.year = 1980;
		House houses[] = new House[5];
		houses[0] = house1;
		houses[1] = house2;
		houses[2] = house3;
		houses[3] = whiteHouse;
		houses[4] = esqersHouse;

		// houses[0].toString();
		System.out.println(houses[0].address);
		for (int i = 0; i < houses.length; i++) {
			System.out.println(houses[i].type + "|" +houses[i].address);
			
		for(House h:houses) {
			System.out.println(h.type + "===>"+h.address + " ===>"+h.year);
		}
		}
		
		System.out.println("====Array list of House Objects====");

		ArrayList<Integer> numsList = new ArrayList<>();
		ArrayList<House> housesList = new ArrayList<>();
		
		housesList.add(house1);
		housesList.add(house2);
		housesList.add(house3);
		housesList.add(whiteHouse);
		housesList.add(esqersHouse);
		ArrayList<House> housesList2 =new ArrayList<>(Arrays.asList(houses));
        List<House>housesList3 =Arrays.asList(houses);// not recommended 
        
        for(House house: housesList) {
        	int y = house.year;
        	if(house.year>= 2006 && house.year<= 2016) {
        		System.out.println(y + "|"+ house.address);
        	}
        }
        for (int j = 0; j < housesList.size(); j++) {
			House tempHouse = housesList.get(j);
			if(tempHouse.year >= 2006 && tempHouse.year <= 2016) {
				System.out.println(tempHouse.year + "~~"+tempHouse.address);
			}
		}
        
       // public static void printHouseInfo(House house) {
        //	System.out.println("============");
        	
        	
        }
	}

