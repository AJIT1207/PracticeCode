package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharsLeet {

    public static void main(String[] args) {

        String words[] = {"bella", "label", "roller"};

        System.out.println(commonChar(words));
    }

    public static List<String> commonChar(String words[])
    {
        List<String> list = new ArrayList<>();

        int min_frequencies[] = new int[26];

        Arrays.fill(min_frequencies, Integer.MAX_VALUE);

        for (String currentString : words)
        {
            int char_frequency[] = new int[26];

            for (char c : currentString.toCharArray())
            {
                char_frequency[c-'a']++;
            }

            for (int i = 0 ; i < 26; i++)
            {
                min_frequencies[i] = Math.min(min_frequencies[i], char_frequency[i]);
            }
        }

        for (int i = 0 ; i < 26; i++)
        {
            while (min_frequencies[i] > 0)
            {
                list.add("" + (char)(i + 'a'));
                min_frequencies[i]--;
            }
        }

        return list;
    }
}
