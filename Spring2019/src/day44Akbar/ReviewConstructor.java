package day44Akbar;


public class ReviewConstructor {

	/*public void ReviewConstructor() {
		System.out.println("Boom");
	} 
	this is not a constructor since "void" is there.
	*/
	
	
	// we can use any access modifier for constructor(public, private, default or protected)
	public ReviewConstructor(String abc) {
		System.out.println("Boom Real"+ abc);
	}

	public static void main(String[] args) {
		// ReviewConstructor rev = new ReviewConstructor();

	}

}
