package geeksforgeeks;

public class PrimeNumbers {
    public static void main(String[] args) {

        int num = 229;

        for (int i = 2; i <= 50; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i + " ");
            }
        }

        System.out.println(isPrime(num));

    }

    public static boolean isPrime(int num)
    {
        if (num < 2)
        {
            return false;
        }

        for (int i = 2;i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }

        return true;
    }


}
