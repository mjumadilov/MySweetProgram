package day60;


public class SmartTV extends TV{

	 int channelCount = 200 ; 
	  
	  @Override
	  public void play() {
	    System.out.println("Playing smart");
	  }
	  
//	    @Override
//	    public int getChannleCount() {
//	      return channelCount; 
//	    }
	//  @Override
	//  public int getChannleCount() {
//	    return super.getChannleCount();
	//  }

	  public static void main(String[] args) {

	    //List<String> lst = new ArrayList<>(); 
	    TV tv1 = new SmartTV(); 
	    System.out.println(tv1.channelCount);
	    
	    tv1.play();  //new SmartTV().play(); 
	    
	    System.out.println( tv1.getChannleCount() );
	    
	    System.out.println(  new SmartTV().getChannleCount()  ) ; 
	    
	  }

	}
