package practicecode;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibo(n));

    }
    public static int fibo(int n)
    {
        if(n == 1)
        {
            return n;
        }
        return n *  fibo(n-1);
    }
}
