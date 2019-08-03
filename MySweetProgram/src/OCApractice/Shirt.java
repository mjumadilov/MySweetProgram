package OCApractice;

public  class  Shirt{

public  static  String   getColor (  ) {

return "Green";

}

}



// line n1
import static clothing.Shirt.getcolor;
class Jeans {
								/*At line n1 insert : 

At line n2 insert:  */
public void matchShirt (  ) {

// line n2
	String color = getColor(  );
if( color.equals("Green") ){

System.out.println( "Fit" );

}

}

public static void main(String[ ]  args ) {

Jeans   trouser = new   Jeans(  );

trouser.matchShirt(  );

}

}