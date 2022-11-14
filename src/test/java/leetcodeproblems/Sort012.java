package leetcodeproblems;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = {1,2,0,1,2,0};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int arr[])
    {
        int n0 = 0, n1 = 0, n2 = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                n0++;
            }
            else if(arr[i] == 1)
            {
                n1++;
            }

            else if(arr[i] == 2)
            {
                n2++;
            }
        }

        for (int i = 0 ; i < n0; i++)
        {
            arr[i] = 0;
        }

        for (int i = 0 ; i < n1; i++)
        {
            arr[n0 + i] = 1;
        }

        for (int i = 0 ; i < n2; i++)
        {
            arr[n0 + n1 + i] = 2;
        }





        return arr;
    }
}
