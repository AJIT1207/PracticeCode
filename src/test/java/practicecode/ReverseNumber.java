package practicecode;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(swapping(arr)));


    }

    public static int[] swapping(int[] arr)
    {
        int len = arr.length-1;

        for(int i =0 ;i <=len/2; i++)
        {
            interchange(arr, i, len-i);
        }
        return arr;
    }

    public static void interchange(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
