package day48Inheritance;

public class AStudentTester {

	public static void main(String[] args) {

		
		APerson p1 = new APerson();
		p1.name = "Lili";
		p1.age = 25;
		p1.heigth = 5.6f;
		p1.gender = 'M';
		p1.eat();
		
		System.out.println(p1.heigth);
		
		AStudent s1 = new AStudent();
		s1.name = "Oguz";
		s1.age = 24;
		s1.heigth = 5.1f;
		s1.gender = 'M';
		s1.studentId = 123;
		s1.eat();
		
		System.out.println(s1.studentId);
	}
}

