package replNew;

public class R193 {

	public static boolean isPalindrome(String check) {
		  check = check.replace(" ", "").toLowerCase();

		  String str="";
		    for(int i= check.length()-1; i>=0; i--){
		      str += (check.charAt(i));
		    }
		    if(str.equals(check)){
		      return true;
		    }else{
		      return false;
		    }
		  }
		}