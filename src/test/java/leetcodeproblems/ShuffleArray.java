package leetcodeproblems;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        shuffle(arr);
    }
    static void shuffle(int arr[])
    {
        Random r = new Random();

        for (int i  = 0 ; i < arr.length; i++)
        {
            Integer j = r.nextInt(i+1);
            swap(arr, i, j);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
