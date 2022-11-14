package leetcodeproblems;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";

        System.out.println(countmatch(a,b));
    }

    static int countmatch(String a, String b)
    {
        String copy = "";
        int count = 0;
        while (copy.length()<b.length())
        {
               copy = copy + a;
               count++;
        }

        if(copy.indexOf(b)>=0)
        {
            return count;
        }
        if((copy+a).indexOf(b)>=0)
        {
            return ++count;
        }

        return -1;
    }
}
