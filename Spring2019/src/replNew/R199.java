package replNew;

public class R199 {
	public static int[] do_switch(int[] i) 
	 {
	
		i[0] = i[i.length-1];
		i[i.length-1] = i[0];
		return (i); 
	 }

		}