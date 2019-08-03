package repl;

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    int house = s.nextInt();
    int player = s.nextInt();
    
    //your code here
    
    if (player > house){
  System.out.println("bust");
}
  else if (player<house){
    System.out.println("player loss");
  }


  

    
  }
}