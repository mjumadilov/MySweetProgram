package replNew;

public class R177MethodsMerge {
	
	public static int[] mergR(int[] a,int[] b) {
	     int[] merge = new int [a.length+ b.length];		
			 int c = 0;
			 
			 for (int i = 0; i < a.length; i++) {
				merge[i] = a[i];
				c++;
				
			}
			 for (int j = 0; j < b.length; j++) {
				 merge[c++] = b[j];
				
			}
			 
			 for (int i = 0; i < merge.length; i++) {

			 }
			return merge;

	   
	    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
	   
	  }
	}