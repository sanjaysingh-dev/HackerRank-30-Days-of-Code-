package Day08_DictionariesAndMaps;
import java.util.*;

public class Solution{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<String,Integer> mymap = new HashMap<String,Integer>();

        for(int i=0;i<N;i++){
            String name = sc.next();
            int number = sc.nextInt();
            sc.nextLine();
            mymap.put(name,number);
        }

        while(sc.hasNext()){
            String query = sc.next();

            if(mymap.containsKey(query))
            System.out.println(query+"="+mymap.get(query));

            else
            System.out.println("Not found");    
        }

        sc.close();
    }
}


