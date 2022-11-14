package leetcodeproblems;

import java.util.HashSet;
import java.util.Set;

public class LengthofLongestsubstring {
    public static void main(String[] args) {
        String str =   "abcabcbb";
        System.out.println(lenghstring(str));
    }

    static int lenghstring(String str)
    {
        Set<Character> set = new HashSet<>();
        int i = 0 , j = 0 , max = 0;
        while (j < str.length())
        {
            if(!set.contains(str.charAt(j)))
            {
                set.add(str.charAt(j++));
                max = Math.max(max, set.size());
            }
            else {
                set.remove(str.charAt(i++));
            }
        }
    return max;
    }
}
