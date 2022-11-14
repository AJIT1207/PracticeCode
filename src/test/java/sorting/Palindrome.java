package sorting;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(ispalindrome(str));
    }

     static boolean ispalindrome(String str)
     {
        str = str.toLowerCase();

        for(int  i = 0 ; i <= str.length()/2 ; i++)
        {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);

            if(start != end)
            {
                return false;
            }
        }
        return true;
     }

}
