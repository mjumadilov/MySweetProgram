package r191;


class Student{
	int marks = 10;
}

public class Quizz {

	public static void main(String[] args) {
		
		Student s = new Student();
		switch(s.marks) {
		default:
			System.out.println("100");
		case 10:
			System.out.println("10");
		case 98:
			System.out.println("98");
		}
		// TODO Auto-generated method stub

	}

}
