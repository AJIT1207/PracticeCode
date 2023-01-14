package hackerrank;

import java.util.concurrent.ExecutionException;

class MyExceptionnew extends Exception
{
    MyExceptionnew(String s)
    {
        super(s);
    }

}

public class Customexc {

    public static void main(String[] args) {
        try {
           throw new MyExceptionnew("This is custom exception");
        }

        catch (MyExceptionnew e)
        {
            System.out.println("hello");

            System.out.println(e.getMessage());
        }
    }
}
