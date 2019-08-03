package day46;

public class PersonAction {

	public static void main(String[] args) {

		Person p1 = new Person("Ganisher", 6.1f, 'M');
		Person p2 = new Person("Mavlida", 5.3f, 'F');

		System.out.println(Person.race);
		
		
		System.out.println(p1.race);
		Person.race = "Humanoid";
		System.out.println(p2.race);
		
		p2.race = "Spartan";
		System.out.println(p1.race);
	}

}
