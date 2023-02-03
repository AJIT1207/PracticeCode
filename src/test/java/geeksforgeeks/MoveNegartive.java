package geeksforgeeks;

import java.util.Arrays;

public class MoveNegartive {

    public static void main(String[] args) {
        int arr[] = {1,-3,2,3,4,-7,7,-9,5,9};

        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            {
                if (i != j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
