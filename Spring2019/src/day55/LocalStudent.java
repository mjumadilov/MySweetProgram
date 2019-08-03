package day55;

public class LocalStudent extends Student{

	
	public LocalStudent(int id, String name) {
		super(id, name);
	}

	int seatID; 
	  
	  @Override
	  public void attendClass() {
	    System.out.println("attend class in classroom");
	  }
	  
	  
	}

