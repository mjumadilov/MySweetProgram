package day34;

public class JcmdCommand {

	public static void main(String[] args) {

		//String[] args is called command line arguments 
		  // and we can pass value using command line 
		  

		    System.out.println(args.length);
		    for(String item: args){
		      System.out.println(item + " "); 
		    }

		  }

		}
