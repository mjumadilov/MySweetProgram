package day39;

public class HExplorePersonBehavior {

	public static void main(String[] args) {
	    
	    
	    CPerson p = new CPerson(); 
	    p.age = 19; 
	    p.gender = 'M'; 
	    p.name = "Abdul Khan"; 
	    
	    CPerson g = new CPerson(); 
	    g.age = 19; 
	    g.gender = 'F'; 
	    g.name = "Alina"; 
	    
	    p.eat();
	    p.tellMeYourName();
	    p.printPersonInfo();
	    
	    g.eat();
	    g.tellMeYourName();
	    g.printPersonInfo();
	    

	  }

	}
