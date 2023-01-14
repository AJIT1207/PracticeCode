package leetcodeproblems;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8};
        int arr2[] = {1,3,5,7};

     sorting(arr1, arr2);
    }

    static void sorting(int arr1[], int arr2[])
    {
        int merge[] = new int[arr1.length + arr2.length];
        int x = 0, y = 0, z= 0;

        for (int i = 0 ; i < merge.length; i++)
        {
            while (x < arr1.length && y < arr2.length)

            {
                if (arr1[x] < arr2[y])
                {
                    merge[z] = arr1[x];
                    z++;
                    x++;
                }
                else
                {
                    merge[z]  = arr2[y];
                    z++;
                    y++;
                }
            }


            while (x < arr1.length)
            {
                merge[z] = arr1[x];
                z++;
                x++;
            }

            while (y < arr2.length)
            {
                merge[z]  = arr2[y];
                z++;
                y++;
            }
        }
        for (int i = 0 ; i < merge.length; i++)
        {
            System.out.print( merge[i]);
        }

    }
}
