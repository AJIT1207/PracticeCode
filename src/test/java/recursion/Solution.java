package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
       String str1 = "bank";
       String str2 = "kanb";
        System.out.println(areAlmostEqual(str1, str2));

    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length())
        {
            return false;
        }

        if(s1.equals(s2))
        {
            return true;
        }

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < s1.length() ; i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                list.add(i);
            }
        }

        if(list.size() == 2)
        {
            int x = list.get(0);
            int y = list.get(1);
            if(s1.charAt(x) == s2.charAt(y)  && s1.charAt(y) == s2.charAt(x))
            {
                return true;
            }
        }

        return false;
    }
}