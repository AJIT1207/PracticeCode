package geeksforgeeks;

public class Equalibirium {
    public static void main(String[] args) {

        long arr[] = {1,3,5,2,2};
        int n  = arr.length;

        System.out.println(equali(arr, n));
    }

    public static int equali(long arr[], int n)
    {
        long sum = 0;
        for (int i = 0 ; i < n; i++)
        {
            sum += arr[i];
        }

        long sum2 = 0;
        for (int i = 0 ; i < n; i++)
        {
            sum = sum  - arr[i];

            if (sum2 == sum)
            {
                return (i+1);
            }

            sum2 = sum2 + arr[i];
        }

        return -1;
    }
}
