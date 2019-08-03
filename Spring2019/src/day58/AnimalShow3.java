package day58;



public class AnimalShow3 {
public static void main(String[] args) {
Animal [] animals = new Animal[2];
	
	
	Animal a1 = new Dog();
	Animal a2 = new Horse();
	
	animals[0] = a1;
	animals[1] = a2;
	
	for(Animal x: animals) {
		x.noise();
	}
	
}



}
	
	