package OCApractice;

public class CheckingAccount {

	public int amount;
	
	public CheckAccount(int amount) {
			this.amount = amount; }
	public int getAmount() {
		return amount; }
	public void changeAmount(int x) {
		amount += x; }
	}
	

	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int)(Math.random() * 1000)); 
		//line n1
	System.out.println(acct.getAmount());
	}