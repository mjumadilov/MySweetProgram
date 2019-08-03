package repl;

import java.util.Scanner;

public class Mavlida {

	public static void main(String[] args) {
		String firstName, LastName, fullName, email, street, state, city , contact;
	     int age, zipcode;
	     double heigt, weight;
	     boolean isMarried;
	     long WorkPhoneNumber, personalPhoneNumber;
			
	     Scanner scan=new Scanner(System.in);
			   System.out.println("Welcome to the patient portal!");
			   System.out.println("Please enter your personal infomation");
			   System.out.println("Enter your first name");
			   firstName=scan.nextLine();
			   System.out.println("Enter your last name");
			   LastName=scan.nextLine(); 
			   System.out.println("Enter your email");
			   email=scan.nextLine();
			   System.out.println("Enter your street");
			   street=scan.nextLine();
			   System.out.println("Enter your city");
			   city=scan.nextLine();
			   System.out.println("Enter your state");
			   state=scan.nextLine();
			   System.out.println("Enter your zip code");
			    zipcode=scan.nextInt();
			   System.out.println("Enter your work phone number");
			   WorkPhoneNumber = scan.nextLong();
			   System.out.println("Enter your personal phone number");
			   personalPhoneNumber=scan.nextInt();
			   System.out.println("Enter your age");
			   age=scan.nextInt();
			   
			   System.out.println("enter your height");
			   double d=scan.nextDouble();
			   System.out.println("Enter your weight");
			   double b=scan.nextDouble();
			   System.out.println("are you married?");
			   isMarried = scan.nextBoolean(); 
			  // boolean isMarried=true;
			    
			  
			  System.out.println("Patient personal infomation");
			  System.out.println("Full name" +LastName+","+firstName) ;
			  System.out.println("Address"+street+","+city+","+state+","+zipcode);
			  System.out.println("Contacts"+WorkPhoneNumber+"-"+personalPhoneNumber+","+email+":");
	     System.out.println("Age:"+age);
	     System.out.println("Height:"+d);
	     System.out.println("Weight:"+b);
	     System.out.println("Married?"+isMarried);
  
	}

}
