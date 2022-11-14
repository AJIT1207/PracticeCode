package leetcodeproblems;

import java.util.HashSet;
import java.util.Set;

public class StrongPassword {
    public static void main(String[] args) {
        String password  = "Ab1";
        int n = 3;
        System.out.println(minimumNumber(n,password));
    }

    public static int minimumNumber(int n, String password) {

        boolean lowercase = false;
        boolean uppercase = false;
        boolean numbers = false;
        boolean special = false;

        char schar[] = "!@#$%^&*()-+".toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : schar)
        {
            set.add(c);
        }

        for (int i = 0 ; i < n ; i++)
        {
            char x  = password.charAt(i);

            if(x >= '0' || x <= 9 )
            {
                numbers = true;
            }

            if (x >= 'a' || x <= 'z')
            {
                lowercase = true;
            }

            if(x >= 'A' || x <= 'Z')
            {
                uppercase = true;
            }

            if(set.contains(x))
            {
                special = true;
            }
        }

        int need = 0;
        need =  need + (lowercase ? 0: 1);
        need =  need + (uppercase ? 0: 1);
        need =  need + (numbers ? 0: 1);
        need =  need + (special ? 0: 1);

        return n + need < 6 ? 6 -n : need;

    }
}
