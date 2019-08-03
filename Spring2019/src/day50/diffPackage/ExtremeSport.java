package day50.diffPackage;

import day50.Sport;

public class ExtremeSport extends Sport{
	
	public void doSport() {
		System.out.println("doing extreme sport ---- sky diving");
	}

	public static void main(String[] args) {
		ExtremeSport e1 = new ExtremeSport();
		e1.doSport();
	}
	
}
