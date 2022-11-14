package leetcodeproblems;

public class Digit {
    public static void main(String[] args) {
        String s = "abdc123fhf";
        System.out.println(digit(s));
    }

    static int digit(String s)
    {
        char ch[]  = s.toCharArray();
        int first = 0;
        int second = 0;
//        int count = 0;
        for(char c : ch)
        {
            if(Character.isDigit(c))
            {
                int count  = c - '0';

                if(count > first)
                {
                    second = first;
                    first = count;
                }
                else if(count > second && count < first)
                {
                    second = count;
                }
            }
        }


        return second;
    }
}
