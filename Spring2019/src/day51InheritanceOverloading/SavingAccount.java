package day51InheritanceOverloading;

public class SavingAccount extends BankAccount{

	
	 double returnRate;

	  public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
	    super(accountName, accountNumber, balance);
	    this.returnRate = returnRate;
	  }

	  	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + 
				", accountName=" + accountName + ", "
						+ "accountNUmber="
				+ accountNUmber + ", balance=" + balance +  "]";
	}

		@Override
	  	public void deposit(int money) {
	  		this.balance +=money;
	  		this.balance += 100;
	  		
	  		
	  	}
		@Override
	  	public void withdraw(int money) {
	  		this.balance = this.balance  - money - 10;
		}
	  	
	}
