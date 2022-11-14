package practicecode;

import java.util.HashMap;
import java.util.Map;

public class MinDistanceHackerRank {
    public static void main(String[] args) {
        int a[] = {7, 1, 3, 4, 1, 7};
        System.out.println(minDistance(a));
    }


    public static int minDistance(int[] a) {
        int mindistance = Integer.MAX_VALUE;
        int previndex = 0;
        int currentindex  = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < a.length ; i++)
        {
            if(map.containsKey(a[i]))
            {
                currentindex = i ;
                previndex = map.get(a[i]);
                mindistance = Math.min((currentindex-previndex), mindistance);
            }
            map.put(a[i],1);
        }
        return (mindistance == Integer.MAX_VALUE ? -1 : mindistance);
    }

}
