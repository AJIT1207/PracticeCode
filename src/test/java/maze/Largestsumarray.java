package maze;

public class Largestsumarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-5,-6,-7};

        System.out.println(subarraysum(arr));
    }

    public static int subarraysum(int arr[])
    {
        int sum = 0;
        int max = 0;
        for (int i : arr)
        {
            sum += i;
            if(sum > max)
            {
                max  = sum;
            }

            if(sum < 0)
            {
                sum = 0;
            }
        }

        return max;
    }
}
