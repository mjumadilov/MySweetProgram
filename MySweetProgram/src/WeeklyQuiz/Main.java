package WeeklyQuiz;

import java.util.*;
class Main {
  public static void main(String[] args) {
    
  }
  
  public static int missingNumber(int[] arr){
   int a=0;
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
           
              for(int j=0;j<9;j++){
                if(arr[j]!=(j+1)){
                  a=arr[j];
                  a=a-1;
                  break;
    }
          
            }
            return a;
  }
  
}