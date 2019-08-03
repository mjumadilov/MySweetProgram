package day41;

import day40.FBankAccount;

public class StudentAction {

	public static void main(String[] args) {

		Student muammar = new Student(); 
		muammar.name = "muammar" ; 
		muammar.age = 27 ; 
		muammar.ssn = 1234567 ; 
		
		muammar.displayName();
		
		
		// BankAccount is in different package 
		FBankAccount acc1 = new FBankAccount(); 
		
	
		//System.out.println(acc1.balance);
		//System.out.println(acc1.accountHolder);
		//acc1.add100Dollar();
		
		
		
		
//		muammar.displayNameAndAge(); 
//		muammar.displayshowSSN(); 
		
		
		
		
		
	}

}
