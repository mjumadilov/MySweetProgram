package replNew;

public class R160MethodBill {

	public static void main(String[] args) {

		System.out.println();
	}

	public double waterTax(double units) {
		double bill = 0.0;

		// your code here

		if (units <= 50) {
			bill = units * 0.60;}
		if (units > 50 && units < 100) {
			bill = units * 0.90;}
		if (units > 100 && units < 150) {
			bill = (units * 0.9)+ 50;
		}
		if (units > 150 && units <200) {
			bill = (units * 0.90) + 100;}
		// end your code here

		return bill;
	}// end waterTax

}