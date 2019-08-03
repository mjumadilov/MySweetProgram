package day19;

public class StairCase {

	public static void main(String[] args) {

		String stairs = "*";
		//String stairCase = "";

		int x = 1;

		while (x <= 5) {
		System.out.println(stairs);
		stairs = stairs + "*";
			x++;

		}
		System.out.println("Total Stair Case is " + stairs);

	}

}