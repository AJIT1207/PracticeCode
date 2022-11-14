package leetcodeproblems;

public class LargestChar {
    public static void main(String[] args) {
        String str = "ADEabdce";

        char ch[] = str.toCharArray();

        boolean lowercase[] = new boolean[26];
        boolean uppercase[]  = new boolean[26];

        for (char c : ch)
        {
            if(Character.isLowerCase(c))

                lowercase[c - 'a'] = true;

           if(Character.isUpperCase(c))

               uppercase[c - 'A'] = true;


        }

        for (int  i = 0; i <=25 ; i++)
        {
            if(lowercase[i] && uppercase[i])
            {
                System.out.println((char)(i + 'A') + " ");
            }

        }


    }
}
