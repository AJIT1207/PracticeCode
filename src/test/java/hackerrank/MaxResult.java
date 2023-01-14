package hackerrank;

import java.util.Arrays;

public class MaxResult {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        System.out.println(productarray(nums));
    }
    public static int productarray(int nums[])
    {
        int minProduct = nums[0];
        int maxProduct = nums[0];

        int maxResult = nums[0];

        for (int i = 1 ; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            minProduct = Math.max(nums[i], minProduct * nums[i]);
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            maxResult = Math.max(maxProduct, maxResult);
        }
        return maxResult;
    }
}
