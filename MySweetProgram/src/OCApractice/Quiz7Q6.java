package OCApractice;

import java.util.ArrayList;

public class Quiz7Q6 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        names.add("John");

        

if( names.remove( "Bran" ) ) {
        names.remove("John");
       }
System.out.println(names);
}
}