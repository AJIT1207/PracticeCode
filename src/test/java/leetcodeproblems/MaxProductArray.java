package leetcodeproblems;

public class MaxProductArray {
    public static void main(String[] args) {
        int arr[] = {-2,3,-4};

        System.out.println(maxminproduct(arr));
    }

    static int maxminproduct(int arr[])
    {
        int maxResult  = arr[0];
        int minProduct = arr[0];
        int maxProduct = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            minProduct = Math.max(arr[i], minProduct * arr[i]);
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            maxResult = Math.max( maxResult, maxProduct);
        }

    return maxResult;
    }

}
