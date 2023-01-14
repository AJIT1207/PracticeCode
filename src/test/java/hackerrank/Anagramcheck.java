package hackerrank;

public class Anagramcheck {
    public static void main(String[] args) {
        String str = "abc";

        int first = 0;
        int end = str.length()-1;

            for (int  i  = 0 ;  i < str.length()/2; i++)
            {
                if(str.charAt(first) == str.charAt(end))
                {
                    first++;
                    end--;
                }
           }



        if (first == end)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
