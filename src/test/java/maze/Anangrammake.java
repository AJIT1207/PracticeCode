package maze;

import java.util.HashMap;
import java.util.Map;

public class Anangrammake {
    public static void main(String[] args) {
        String str1 = "ce";
        String str2 = "ef";

        System.out.println(makeanagram(str1, str2));
    }

    public static int makeanagram(String str1, String str2)
    {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++)
        {
            if(map.get(str1.charAt(i)) == null)
            {
                map.put(str1.charAt(i), 1);
            }
            else
            {
                int curr = map.get(str1.charAt(i));
                map.put(str1.charAt(i), curr + 1);
            }
        }

        for (int i = 0; i < str2.length(); i++)
        {
            if (map.containsKey(str2.charAt(i)))
            {
                int curr = map.get(str2.charAt(i));
                if(curr == 1)
                {
                    map.remove(str2.charAt(i));
                }
                else
                {
                    map.put(str2.charAt(i), curr-1);
                }
            }
            else
            {
                count++;
            }
        }

        for (Integer i : map.values())
        {
            count = count + i;
        }

        return count;
    }
}
