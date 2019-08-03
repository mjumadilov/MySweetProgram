package day51InheritanceOverloading;

public class BankAccount {

	String accountName;
	long accountNUmber;
	double balance;
	public BankAccount(String accountName, long accountNUmber, double balance) {

		this.accountName = accountName;
		this.accountNUmber = accountNUmber;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName 
				+ ", accountNUmber=" + accountNUmber 
				+ ", balance=" + balance
				+ "]";
	}
	
	public void deposit(int money) {
	   
	    this.balance += money;
	  }
	  
	  public void withdraw(int money) {
	   
	    this.balance -= money;
	  }

	}