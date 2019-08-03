package day54;

public class WarmUp2 {

	
	
	int num = getANumber();
	
	public static void main(String[] args) {
		WarmUp2 w = new WarmUp2();
		System.out.println(w.num);
	}
}

/*
 * 
 * 
 * Inheritance : 

	why do we need it : 
		a class can extends another class 
		to inherit fields and methods 

	what's inherited 
		all visible fields and methods
		constructor is not inherited 

	We can just use all inherited members 
	just like it's our own 

	and we have option to add new fields 
	or methods that does not exists in super class 

	We can also change what super class provided 
		
		fields 
			if we declare a field that already exists in super class 
				it will hide super class's field 

			IT JUST NEED TO HAVE SAME NAME 
			IT CAN HAVE EVERYTHING ELSE DIFFERENT 

			How do we access a hidden field in sub class

			parent 
				int capacity 

			Child 
				long capacity 


			super.capacity -->> parent version 
			this.capacity --->> current class version



		methods 

			static method 

				a sub class define same method as super class, it hides super class's static method 

			public class Person{

				public static void showRace(){
					print ("Human")
				} 

			}

			this. super. MUST NOT SHOW UP IN STATIC METHOD 
			instance members  MUST NOT SHOW UP IN STATIC METHOD 

			public class Spartan extends Person{

				@Override ---->> ERROR !!! 
				public static void showRace(){
					Person.showRace(); 
					print ("Spartan")
				} 

			}


		instnace method 
			--- we can define sub class version of the method 
				 to provide new implementation 
				---->> Overriding 
					it's exclusively for instance method 

			public class Person{

				public void sleep(){
					print ("Human")
				} 

			}
			public class Spartan extends Person{

				@Override -->>>ENFORCE OVERRIDING RULE 
				public void sleep(){	
					super.sleep(); 
					super.sleep(); 
					print ("Spartan dont sleep")
					super.sleep(); 
					
				} 

			}


*/
 