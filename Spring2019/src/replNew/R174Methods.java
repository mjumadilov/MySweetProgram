package replNew;

public class R174Methods {

	 public static String lameDb(String db, String op,String id,String data)
	  {
	    if(op.equals("add")){
	      db = db+'#'+id+data+"";
	    }else if(op.equals("edit")){
	      db = db.substring(0, db.indexOf(id)+1)+data+db.substring(db.indexOf(id)+1+data.length())+"";
	    }
	    else if(op.equals("delete")){
	      db = db.substring(0, db.indexOf(id)-1)+ db.substring(db.indexOf(id)+data.length()+1)+"";
	    }
	    return db;
	  }//end lameDb
	  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }
	  
	}