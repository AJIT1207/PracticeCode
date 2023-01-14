package geeksforgeeks;

import java.util.Random;

public class Randomvalue {
    public static void main(String[] args) {
        Random r = new Random();

        StringBuilder sb =  new StringBuilder();

        for (int i = 0; i < 10; i++)
        {
            int rand = r.nextInt(2);

            if(rand == 0)
            {
                char value = (char) (r.nextInt(26) + 'a');
                sb.append(value);
            }
            else
            {
                int d = r.nextInt(10);
                sb.append(d);
            }

        }

        System.out.println(sb.toString());

    }
}
