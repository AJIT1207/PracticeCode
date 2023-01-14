package hackerrank;

public class Maxavgsubarray {
    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(avgsubarray(nums, k));

    }

    public static double avgsubarray(int nums[],int k)
    {
        int sum = 0;
        for (int i = 0 ; i < k ;i++)
        {
            sum += nums[i];

        }

        int maxSum = sum;

        for (int i = 0, j = k; j < nums.length; i++, j++)
        {
            sum = sum - nums[i] + nums[j];

            maxSum = Math.max(maxSum, sum);
        }

        return  (((double) maxSum ) / ((double) k));
    }
}
