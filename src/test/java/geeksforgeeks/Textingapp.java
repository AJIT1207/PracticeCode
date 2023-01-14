package geeksforgeeks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Textingapp {

    public static void main(String[] args) {

        String str = "ajit";

        fibo(str);

    }

    static void fibo(String str)
    {
       if(str ==  null || str.length() == 1)

       {
           System.out.println(str);
       }

       else
       {
           System.out.print(str.substring(str.length()-1));
           fibo(str.substring(0, str.length()-1));
       }


    }
}
