package geeksforgeeks;

public class ReversrwordEdgetest {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";

        System.out.println(reversewords(S));
    }

    public static String reversewords(String S)
    {
        String words[] = S.split("\\.");
        String reversentance = "";
        for(int j  = words.length-1; j>=0; j--)
        {
            if(j == 0)
            {
                reversentance += words[j];
            }
            else
            {
                reversentance += words[j] + ".";
            }

        }

        return reversentance;
    }
}
