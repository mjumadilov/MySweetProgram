package day7;

import java.util.Scanner;



public class PatientInfo {

	public static void main(String[] args) {
		
		 System.out.println("Welcome to the patient portal!");
			System.out.println("Please enter your personal information");
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your first name");
			
			String firstName = input.nextLine();
			
			System.out.println("Enter your last name");
			
			String lastName = input.nextLine();
			
			System.out.println("Enter your email");
			
			String email = input.nextLine();
			
			System.out.println("Enter your street");
			
			String street = input.nextLine();
			
			System.out.println("Enter your city");
			
			String city = input.next();
			
			System.out.println("Enter your state");
			
			String state = input.next();
			
			System.out.println("Enter your zip code");
			
			Integer zipcode = input.nextInt();
			
			System.out.println("Enter your work phone number");
			
			long workPhone = input.nextLong();
			System.out.println("Enter your personal phone number");
			
			long personalPhone = input.nextLong();
			
			System.out.println("Enter your age");
			
			String age = input.next();
			
			System.out.println("Enter your height");
			
			double height = input.nextDouble();
			
			System.out.println("Enter your weight");
			
			double weight = input.nextDouble();
			
			boolean isMarried;
			System.out.println("Are you married?");
		   
			isMarried = input.nextBoolean();
			
			//NextBoolean(); married = true;
			
			 System.out.println("Patient personal information" +"\n" 
						+"Full name: "+ lastName + ", "+firstName + "\n"+"Address: "
						+ ""+ street +", "+city + ", "+ state +" "+ zipcode +"\n" 
						+ "Contacts: work phone number - "+ workPhone+", "+"personal phone number - "+personalPhone+
						", "+"email: "+email+"\n"+"Age: "+age +"\n"+ "Height: "
						+ height+"\n"+"Weight: "+weight+" pounds"+"\n" +"Married? :" +isMarried);
					}

				}