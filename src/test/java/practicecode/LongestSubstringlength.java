package practicecode;

import java.util.*;

public class LongestSubstringlength {
    public static void main(String[] args) {

        String s = "abceba";

        System.out.println(longest(s));

    }

    static int longest(String s)
    {
        int i = 0 , j = 0, max = 0;
        Set<Character> set = new HashSet<Character>();

        while(j < s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
            else
            {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }

}
