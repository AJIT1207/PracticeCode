package sorting;

import java.util.HashMap;
import java.util.Map;

public class Practi {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        Map<Integer, Integer> map  = new HashMap<Integer, Integer>();
        for(Integer i : arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }

        for(Integer i : arr)
        {
            if(map.get(i) == 1 || map.get(i) == 2)
            {
                System.out.println(i);
            }
        }

    }
}
