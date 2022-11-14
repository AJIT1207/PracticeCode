package leetcodeproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveCharToMakeAnagram {
    public static void main(String[] args) {
        String s = "cde";
        String t = "abc";

        System.out.println(makeanagram(s, t));
    }

    static int makeanagram(String s, String t)
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray())
        {
            int count = map.containsKey(c)? map.get(c) : 0;
            map.put(c, count+1);
        }

        for (char c : t.toCharArray())
        {
            int count = map.containsKey(c) ? map.get(c) :0;
            map.put(c, count-1);
        }

        List<Integer> list  = new ArrayList<>(map.values());
        int total = 0;
        for (Integer v : list)
        {
            total += Math.abs(v);
        }

        return total;



//        int ans[] = new int[26];
//        for(int i = 0 ; i< s.length(); i++)
//        {
//            ans[s.charAt(i) - 'a']++;
//            ans[t.charAt(i) - 'a']--;
//        }
//        int count = 1;
//        for (int  i = 0 ; i < 26 ; i++)
//        {
//            if(ans[i] > 0)
//            {
//                count = count + ans[i];
//            }
//        }
//
//        return count;
    }
}
