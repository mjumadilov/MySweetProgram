package day8;

public class LogicalOpPr {

  public static void main(String[] args) {
    
    int score = 10 ; 
    boolean result1 = score > 4 ; 
    boolean result2 = score > 4 && score <11; 
    
    boolean result3 = score > 14 && score <11; 
    boolean result4 = score > 14 || score <11; 
    
    //boolean result5 = score++ >10  && score <12;  10>10 && 11<12
    //boolean result5 = ++score >10  && score <12;  // 11>10 && 11<12
    //boolean result5 = score++ >10 || score <12;  // 10>10 ||11<12
    
    //boolean result5 = score++ >10 && ++score <13;  // 10>10 false so it will not evaluate next one
    //boolean result5 = score++ >10 & ++score <13;  // 10>10 & 12<13 
    
    boolean result5 = score >10 & ++score <13;  //
    
    
    System.out.println( "the value of score right now : " + score );
    
    
    System.out.println("result is " + result1    );
    System.out.println("result is " + result2    );
    System.out.println("result is " + result3    );
    System.out.println("result is " + result4    );
    System.out.println("result is " + result5    );
    
    
    
  }
  
  
}


// Shared via @CodeMix. To open this file type:
// /code-open LogicalOperatorPractice.java 1-38 gzD5oQ