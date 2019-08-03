package day51InheritanceOverloading;

public class AtTheTeller {

	public static void main(String[] args) {

		
		
		SavingAccount s1 = new SavingAccount("Ashraf", 12345, 21100, 2.3);
		System.out.println(s1.toString());
		
		s1.deposit(555);
		System.out.println("Current amount is " + s1.balance);
		
		s1.withdraw(2000);
		System.out.println("Current amount is " + s1.balance);
	}

}
