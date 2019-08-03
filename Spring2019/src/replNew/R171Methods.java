package replNew;

public class R171Methods {

	public static void main(String[] args) {

	
		//at3("Hello", "Mile");
		
		System.out.println(at3("blabla", "a"));
	}
	public static String at3(String target,String word)
	  {
	    return target.substring(0,3)+word+target.substring(3, target.length());
		
		
	  }
}
