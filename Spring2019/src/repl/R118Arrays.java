package repl;
import java.util.*;
public class R118Arrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		
		int count = 0;
		String [] mail = email.split("@");
		
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '@') {
				count++;
			}
		}
		
		if(count == 0 || count > 1) {
			System.out.println("invalid email");
		}
		else {
			System.out.println("Email id: " + mail[0]);
			System.out.println("Email domain: " + mail[1]);
		}
	}

}
