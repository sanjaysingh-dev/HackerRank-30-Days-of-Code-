package Day9_Recursion;
import java.util.*;

class Result {
 
  static int Factorial(int A)
  {
     if(A<=0)
       return 1;  
      
     else 
       return A*Factorial(A-1);
  }  
}


public class Solution {
    public static void main(String []args){
       Scanner sc =new Scanner(System.in);

      int N = sc.nextInt();
        
      sc.close();
      int result = Result.Factorial(N);

      System.out.println(result);

    }
    
}
