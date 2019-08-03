package durga;

public class Discount {
	public static void main(String[] args) 
	{
		double discount=0.0;
		int quantity=Integer.parseInt(args[0]);
		
		if(quantity >= 90) {
			discount = 20;
		}
		if(quantity > 80 && quantity < 90){
			discount = 10;
		}
		
System.out.println(discount);
}
}
