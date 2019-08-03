package replNew;

public class R166MethodsRepeat {


	public static void main(String[] args) {
		 //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    String result = "";
	    
	    for(int i = 0; i < str.length(); i++){
	    if(!result.contains(str.charAt(i)+"")){
	      result += str.charAt(i);
	    }
	  }
	  return result;
	}
	}