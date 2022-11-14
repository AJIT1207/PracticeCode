package recursion;

import java.util.Arrays;

public class Subdomain {
    public static void main(String[] args) {
        String[] str = {"5: ajit", "6: shalu", "7:kalu"};
//        int count = 0;
//        String word[];
        for (int i = 0 ; i < str.length; i++)
        {
            String  word[] = str[i].split(":");

            for (int j = 0; j < word.length; j++ )
            {
                System.out.println(Arrays.toString(word));
            }
        }
    }
}
