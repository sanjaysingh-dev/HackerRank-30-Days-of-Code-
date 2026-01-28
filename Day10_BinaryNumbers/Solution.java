package Day10_BinaryNumbers;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        sc.close();

     String binary = "";

     while (n > 0) {
            int rem = n % 2;        
            binary = rem + binary;    
            n = n/2;           
         }

     int maxCount = 0;
     int count = 0;     

      for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;  
            }
        }

        System.out.println(maxCount);
    }
}      

