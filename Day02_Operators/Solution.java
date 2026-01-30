package Day02_Operators;
import java.util.*;

class Result
{

public static void solve(double meal_cost, int tip_percentage, int tax_percentage)
{
    double tip = meal_cost*tip_percentage/100.0;
    double tax = meal_cost*tax_percentage/100.0;

    double total = meal_cost+tip+tax;

    System.out.println(Math.round(total));
}
}

public class Solution {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        double meal_cost = sc.nextDouble();
        int tip_percentage = sc.nextInt();
        int tax_percentage = sc.nextInt();

        sc.close();

      Result.solve(meal_cost,tip_percentage,tax_percentage);  
    }    
}
