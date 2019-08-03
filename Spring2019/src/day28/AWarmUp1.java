package day28;

public class AWarmUp1 {

	public static void main(String[] args) {
		String str = "Sunday Perfect Day to start coding";

		String[] str2 = str.split(" ");

		String rev = "";
		for (int i = str2.length - 1; i >= 0; i--) {
			rev += str2[i] + " ";
		}
		System.out.println(str);
		
		System.out.println(rev);
		  
		}


	}


