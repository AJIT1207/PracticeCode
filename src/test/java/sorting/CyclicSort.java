package sorting;

import java.util.Arrays;

import static sorting.SelectionSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2};
        cyclesorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclesorting(int arr[])
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] < arr.length && arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

    }
    static void swap(int arr[], int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
