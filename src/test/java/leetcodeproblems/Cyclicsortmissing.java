package leetcodeproblems;

import java.util.Arrays;

public class Cyclicsortmissing
{
    public static void main(String[] args) {

        int arr[] = {2,1,3,5,4};

        System.out.println(missingnumber(arr));
    }

    public static int missingnumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }

//        List<Integer> list = new ArrayList<>();
//        int ans = 0 ;
        for(int index = 0 ; index < arr.length;  index++)
        {
            if(arr[index] != index+1)
            {
               return index+1;
            }
        }

    return arr.length + 1;
    }
        public static void swap(int arr[], int start, int end)
        {
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }





