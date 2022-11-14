package practicecode;

import java.util.HashMap;
import java.util.Hashtable;

public class TwoStringCommonchars {
    public static void main(String[] args) {

            String s1 = "hello";
            String s2 = "htc";
            System.out.println(commonchar(s1, s2));
        }
    private static String commonchar(String s1, String s2) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0 ; i < s1.length(); i++)
        {
            if(!hash.containsKey(s1.charAt(i)))
            {
                hash.put(s1.charAt(i), i);
            }
        }
        for (int i = 0 ; i < s2.length(); i++)
        {
            if(hash.containsKey(s2.charAt(i)))
            {
                return "YES";
            }
        }

    return "NO";
        }
    }



