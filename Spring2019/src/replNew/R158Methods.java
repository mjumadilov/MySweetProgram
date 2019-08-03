package replNew;

public class R158Methods {

	public static void main(String[] args) {
		
		//c_profits(100, 150);
		System.out.println(c_profits(100, 150));

	}
	 public static String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	   if(buyPrice < sellPrice){
	     return "profit";
	      }
	   if(buyPrice > sellPrice){
	     return "loss";
	   }
	   if(buyPrice == sellPrice){
	     return "no loss";
	   }
	return null;
	  }

}
