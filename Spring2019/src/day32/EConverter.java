package day32;

public class EConverter {

	public static void main(String[] args) {

		//meterToCM(20);
		
		System.out.println(meterToCM(15));
		System.out.println(feetToINch(10));
		System.out.println(fahrToCel(81));

	}
	public static int meterToCM(int m) {
		int cm = m*100; 
		
		return cm;
		
	}
	public static double feetToINch(int feet) {
		
		double inch = (double)feet*12; 
		
		return inch;
		
	}
	public static double fahrToCel(int fa) {
		double celcius = (fa-32)/1.8;
        return celcius;
	}
	
}
