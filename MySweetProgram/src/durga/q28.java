package durga;

public class q28 {

	public static void main(String[] args) {
		String s="wall";
		String result=null;
//		if(s.equals("Color"))
//		{
//			result="Blue";
//		}
//		else if(s.equals("Wall"))
//		{
//			result="Regular";
//		}
//		else
//		{
//			result="No Result";
//		}
//		
//		System.out.println(result);
		
		result = s.equals("Color")?"Blue":s.equals("Wall")?"Regular":"No Result";
		System.out.println(result);
	}

}
