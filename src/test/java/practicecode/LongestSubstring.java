package practicecode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lobgest(s));
    }

    static int lobgest(String s)
    {
        int i = 0 , j = 0 , max = 0;
        String longestsubstring = null;
        Set<Character> set = new HashSet<>();

        while (j < s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
                System.out.println(set);
            }
            else
            {
                set.remove(s.charAt(i++));
            }

            // System.out.println(set);
        }

        return max;
    }
}
