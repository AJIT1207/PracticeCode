package geeksforgeeks;

import java.util.*;

public class SortingmapbasedpnValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();

        map.put("Ajit",5);
        map.put("Hello",1);
        map.put("ram",7);

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            list.add(entry.getValue());
        }

        Collections.sort(list);

        //   System.out.println(list);

        for (int num : list)
        {
            for (Map.Entry<String, Integer> entry : map.entrySet())
            {
                if (entry.getValue().equals(num))
                {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }

        System.out.println(sortedMap);
    }
}
