package hackerrrankproblems;

import java.util.Arrays;

public class Commonchars {
    public static void main(String[] args) {
        String s1 = "ajitss";
        String s2 = "jiswal";


        int freq1[] = new int[26];
        int freq2[] = new int[26];

        Arrays.fill(freq1, 0);
        Arrays.fill(freq2, 0);

        for (int  i = 0 ; i < s1.length(); i++)
        {
            freq1[s1.charAt(i) - 'a']++;

        }

        for (int i = 0 ; i < s2.length(); i++)
        {
            freq2[s2.charAt(i) - 'a']++;
        }

        int count = 0;

         String str = "";
        for (int i = 0 ; i < 26; i++)
        {

            if ((freq1[i] ^ freq2[i]) != 0)
            {
                str = str + (char)(i + 'a');
            }


//            if(freq1[i] != 0 && freq2[i] != 0)
//            {
//                for (int j = 0 ; j < Math.min(freq1[i],freq2[i]); j++)
//                {
//                    System.out.println((char)(i+'a'));
//                }
//            }
        }

        System.out.println(str);

    }
}
