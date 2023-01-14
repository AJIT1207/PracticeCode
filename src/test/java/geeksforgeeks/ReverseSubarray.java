package geeksforgeeks;
//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&curated[]=1&sortBy=submissions
import java.util.Arrays;

public class ReverseSubarray {
    public static void main(String[] args) {
     int arr[] = {4, 3, 7, 8, 6, 2, 1};
     int n = arr.length-1;
        System.out.println(Arrays.toString(reverseSubArrays(arr, n)));
    }

    public static int [] reverseSubArrays(int[] arr, int n)
    {
        for(int i = 0; i < n - 1; i = i + 2)
        {
            if(arr[i]> arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        //second step
        for(int i = 1; i < n - 1; i = i + 2)
        {
            if(arr[i] < arr[i+1])
            {
                int temp = arr[i];
                arr[i]  = arr[i+1];
                arr[i+1] = temp;
            }
        }

        return arr;
    }
}
