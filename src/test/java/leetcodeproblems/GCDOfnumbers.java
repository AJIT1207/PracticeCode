package leetcodeproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GCDOfnumbers {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,2};

        System.out.println((gcd(arr)));
    }

    static int gcd(int arr[])
    {
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int  i = 0 ; i < arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

       for (int i : map.keySet())
       {
           if (map.get(i) == 1)
           {
               sum = sum + i;
           }
       }

        return sum;

    }
}
