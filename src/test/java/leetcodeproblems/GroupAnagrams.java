package leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(group(strs));

    }

    public static List<List<String>> group(String strs[])
    {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s1 : strs)
        {
        char arr[] = s1.toCharArray();

        Arrays.sort(arr);

        String str = new String(arr);

        if(map.containsKey(str))
        {
            map.get(str).add(s1);
        }
        else
        {
            map.put(str, new ArrayList<>());
            map.get(str).add(s1);
        }
    }

        return new ArrayList<>(map.values());
    }
}
