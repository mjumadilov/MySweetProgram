package day57;

public class IceCoffee implements Drinkable{
	
	int size ; 
	  public IceCoffee() {
	    size = 3; 
	  }
	  
	  public static void main(String[] args) {
	    
	    Burger b1 = new Burger("BalckBeanBurger", 5);
	    b1.eat();
	    
	    
	    IceCoffee coffee = new IceCoffee(); 
	    coffee.eat();
	    coffee.drink();
	    
	  }
	  
	  @Override
	  public void eat() {
	    System.out.println("ice coffee can be consumed by drinking ");
	  }

	  @Override
	  public void drink() {
	    System.out.println("Spartan is drinking ice coffee");
	  }

	  

	}
/*---- TASK 1 

Create two interfaces called 

  Edible 	
		with single abstract method  void eat(); 
, Drinkable
		with single abstract method  void drink(); 
		
Drinkable extends Edible interface 

create a class called Burger  and it implements Edible interface 
it has 2 instance fields  name and size 
it has constructors to set the value 
and it has toString method 

create another class called IceCoffee  
	it implements Drinkable interface
	it has 1 instance field  -- size 
	it has constructors to set the value 
	and it has toString method 

fix any error might come up */