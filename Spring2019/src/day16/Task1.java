package day16;

public class Task1 {

	public static void main(String[] args) {
		

		String string;
		string = "Sunday is Java Day";
		int count = string.length();
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
        System.out.println(count);
        System.out.println(""+string.charAt(16)+  string.charAt(17) );
       char last = string.charAt(count-1);
       char beforeLast = string.charAt(count - 2);
       System.out.println(beforeLast+""+last);
       System.out.println(string.substring(count-2,count)); 
       System.out.println(string.indexOf("is"));
        System.out.println(string.contains("Java"));
        System.out.println(string.indexOf("d"));
		
		
	}

}
