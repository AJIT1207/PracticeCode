package leetcodeproblems;

public class Parsing {
    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < s.length(); i++)
        {
            builder.append(s.charAt(i) - 'a' + 1);
        }
        int sum = 0 ;
       for(int m = 0 ; m < k ; k++ )
       {
           sum = 0;
          for (int j = 0 ; j < builder.length(); j++)
          {
              sum = sum + Integer.parseInt(String.valueOf(builder.charAt(j)));

          }

       }

        builder  = new StringBuilder(String.valueOf(sum));

        System.out.println(sum);
    }
}
