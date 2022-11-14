package hackerrank;

//https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
public class Lovelettermystery {
    public static void main(String[] args) {
        String str = "cde";
        System.out.println(operationPalindromeCount(str));
    }

    public static int operationPalindromeCount(String str)
    {
        int count = 0;
        char ch[]  = str.toCharArray();

        for (int i = 0 ; i < ch.length/2; i++)
        {
            int leftasciivalue = (int)ch[i];
            int rightasciivalue = (int)ch[ch.length-i-1];

            if(leftasciivalue < rightasciivalue)
            {
                count = count + rightasciivalue - leftasciivalue;
            }
            else
            {
                count = count + leftasciivalue - rightasciivalue;
            }
        }

        return count;
    }
}
