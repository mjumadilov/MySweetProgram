package day46;

import java.util.ArrayList;

public class ASlackAction {

	public static void main(String[] args) {

		
		ASlackUser s1 = new ASlackUser(); 
	    System.out.println( s1.toString() );
	    // below code will be seen as above code for compiler
	    System.out.println( s1 );
	    
	    ASlackUser s = new ASlackUser ("magician", "akbar@cybertek.com", 0);
	    ASlackUser s2 = new ASlackUser ("instructor", "instructor@cybertek.com", 0);
	    ASlackUser s3 = new ASlackUser ("student", "student@cybertek.com", 29);
	    ASlackUser s4 = new ASlackUser ("mentor", "mentor@cybertek.com", 20);
	    
	    ArrayList <ASlackUser> userList = new ArrayList <>();
	    userList.add(s1);
	    userList.add(s2);
	    userList.add(s3);
	    userList.add(s4);
	    
	    for (ASlackUser each : userList) {
	      System.out.println(each);
	      each.sendMessage("general", "Good morning!" );
	    }
	    
	    

	  }

	}
