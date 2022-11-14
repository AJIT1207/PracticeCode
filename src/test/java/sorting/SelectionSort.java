package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]  = {4,5,-22,1,3};
        insertionsort(arr);
        //selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //method for insertion sort worst case is o(n^2) and best case O(n)

    static void insertionsort(int arr[])
    {
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            for(int j = i +1 ; j > 0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    static void selectsort(int arr[])
    {
        for (int i = 0 ; i < arr.length ; i++)
        {
            //find the max item in the array and swap with the current index
            int last = arr.length - i - 1;
            int maxindex =  getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);

        }
    }

     static void swap(int[] arr, int first, int second)
     {
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;

    }

    static int getMaxIndex(int[] arr, int start, int end)
        {
            int max = start;
            for(int i = start ; i <=end ; i++)
            {
                if(arr[i] > arr[max])
                {
                    max = i;
                }
            }
            return  max;
        }


}
