package Day06_LetsReview;
import java.util.*;

 public class Solution{
    
  public static void main(String []args){
     
    Scanner sc = new Scanner(System.in);
    
    int T = sc.nextInt();
    
    sc.nextLine();
    
  for(int i = 1;i<=T;i++){
        
    String S = sc.nextLine();
    String A="";
    String B="";
    
    for(int j=0;j<S.length();j++)
    {
        if(j%2==0)
         A=A+S.charAt(j);
         
        else if(j%2!=0)
         B=B+S.charAt(j);
    }
   System.out.println(A+" "+B); 
  }
 sc.close(); 
  } 
 }   
