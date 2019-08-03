package day40;

public class GBankActivityClass {

	public static void main(String[] args) {
		FBankAccount costumer1= new FBankAccount();
	    costumer1.accountHolder="Ashraf";
	    costumer1.balance=2935.6;
	    
	    costumer1.showAccountHolder();
	    costumer1.showBalance();
	    
	    // int am = scan.nextInt(); 
	    costumer1.addDollar(-500);
	    
	    costumer1.showBalance();
	    
	    System.out.println("------------");
	    
	    FBankAccount costumer2 = new FBankAccount ();
	    
	    costumer2.accountHolder = "Marat Jumadilov";
	    costumer2.balance = 2500;
	    
	    costumer2.showAccountHolder();
	    costumer2.showBalance();
	    costumer2.add100Dollar();
	    costumer2.showBalance();
	    costumer2.addDollar(200);
	    costumer2.showBalance();
	    

	  }

	}