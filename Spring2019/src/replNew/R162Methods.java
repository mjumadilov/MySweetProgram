package replNew;

public class R162Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
	    
	    if(notEmpty == true && taskId == currentId + 1){
	      return true;
	    }
	    else{
	      return false;
	    }
	  }
	}