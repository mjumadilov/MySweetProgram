package replNew;

public class R178Reverse {

	public static void main(String[] args) {

System.out.println(reverse("java is fun"));	
	
	}
	public static String reverse(String input)
	{
	   String reverse = "";
		
		for(int i = input.length()-1; i >=0; i--){
	     reverse = reverse+ input.charAt(i);
	   }
	   return reverse;
	}
}