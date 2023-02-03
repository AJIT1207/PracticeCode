package hackerrank;
// A Class that represents use-defined exception

class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

// A Class that uses above MyException
public class Main {
    // Driver Program
    public static void main(String args[])
    {
        try {
         //   int k = 25/0;
            // Throw an object of user defined exception
            throw new MyException("second");
        }
//
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }

        catch (MyException ex) {
            System.out.println("first");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("definelty will be executed");
        }
    }
}
