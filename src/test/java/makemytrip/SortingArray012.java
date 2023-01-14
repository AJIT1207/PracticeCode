package makemytrip;

import java.util.Arrays;

public class SortingArray012 {
    public static void main(String[] args) {
        int arr[] = {1,2,0,2,1,0};
        System.out.println(Arrays.toString(sorting(arr)));
    }

    public static int[] sorting(int arr[])
    {
        int low = 0, high = arr.length-1, mid = 0;
        while (mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }

            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        return arr;
    }
}
