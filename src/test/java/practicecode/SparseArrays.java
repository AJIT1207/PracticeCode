package practicecode;

import java.util.HashMap;
import java.util.Map;

public class SparseArrays {

   static int[] matchingStrings(String[] strings, String[] queries) {

       Map<String, Integer> map = new HashMap<String, Integer>();
       int result[] = new int[queries.length];

       for (int i = 0 ; i < strings.length ; i++)
       {
           String inputstring = strings[i];
           if (map.containsKey(inputstring))
           {
               map.put(inputstring, map.get(inputstring) + 1);
           }
           else
           {
               map.put(inputstring, 1);
           }
       }

       for (int i = 0 ; i < queries.length ; i++)
       {
           String querystring = queries[i];

           if(map.containsKey(querystring))
           {
               result[i] = map.get(querystring);
           }
       }
       return result;
   }

    public static void main(String[] args) {
        String strings[] = {"aba","baba","aba","xzxb"};
        String queries[] = {"aba", "xzxb","ab"};

        System.out.println(matchingStrings(strings, queries));
    }


}
