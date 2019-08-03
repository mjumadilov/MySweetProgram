package replNew;

public class R174Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String lameDb(String db, String op,String id,String data)
	  {
	    String[] arr=db.split("#");
	    String newdb="";
	    int num=(Integer.parseInt(id))-1;
	    if(op.equals("add"))
	    newdb=db+"#"+id+data;
	    else if(op.equals("edit"))
	    {
	    arr[num]=id+data;
	   for(int i=0;i<arr.length;i++)
	    {
	      newdb+="#"+arr[i];
	    }
	    newdb=newdb.substring(1);
	    
	    }
	    else if(op.equals("delete"))
	    {
	    for(int i=0;i<arr.length;i++)
	    {
	      if(i==num)
	      continue;
	      newdb+="#"+arr[i];
	    }
	    newdb=newdb.substring(1);
	    }
	    else if(op.equals("none"))
	    newdb=db;
	  return newdb;
	  }
}