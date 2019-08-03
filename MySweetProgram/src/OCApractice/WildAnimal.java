package OCApractice;

class Animal{

String type = "Canine";

int maxSpeed = 60;

Animal ( ) { }

Animal (String  type , int  maxSpeed){

this.type = type;
this.maxSpeed = maxSpeed;

}

}

 

public  class WildAnimal  extends  Animal{

String bounds;

WildAnimal (String  bounds){

//line n1
	super();

	this.bounds = bounds;
	

}

WildAnimal (String  type,  int  maxSpeed , String  t){

//line n2
//	super(type, maxSpeed);
//
//	this.bounds = bounds;
}

public static void main(String[] args) {

WildAnimal wolf = new WildAnimal ("Long");

WildAnimal tiger = new WildAnimal ("Feline" ,  80 , "Short");

System.out.println(wolf.type  +  " " +  wolf.maxSpeed +  " "  +  wolf.bounds);

System.out.println (tiger.type  +  " "  +  tiger.maxSpeed  +  " "  +  tiger.bounds);

}

}