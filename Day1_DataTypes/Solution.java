package Day1_DataTypes;
import java.util.*;

public class Solution {

    public static void main(String []args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner sc = new Scanner(System.in);
        
        int i2 = sc.nextInt();
        double d2 = sc.nextDouble();
        sc.nextLine();
        String s2 = sc.nextLine();
        
        sc.close();

       System.out.println(i+i2);
       System.out.println(d+d2);
       System.out.println(s+s2);
    }
    
}
