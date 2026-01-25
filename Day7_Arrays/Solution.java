package Day7_Arrays;
import java.util.*;

public class Solution {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        sc.close();

        for(int i=N-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}
