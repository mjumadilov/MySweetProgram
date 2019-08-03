package day9;

public class MultiBranchIfStatementIntro {

  public static void main(String[] args) {
    
    // Grade book 
    int score = 80 ; 
    
    // if the score is between 90- A 
    // if the score is between 80-89  B 
    // if the score is between 70-79  B 
    
    
    // ELSE D and print study harder

    // 80<score>89 ? 
    
    if(score >= 90){
      System.out.println(" YOU GOT A ");
    
    }else if(score>=80 && score<90){
      
      System.out.println(" YOU GOT B ");
    
    }else if(score>=70 && score<80){
      
      System.out.println(" YOU GOT C ");
      
    }else {
      
      System.out.println("study harder ");
      
    }
      
    
    
    
    
    

  }

}


// Shared via @CodeMix. To open this file type:
// /code-open MultiBranchIfStatementIntro.java 1-44 6Nc6cw