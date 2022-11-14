package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int arr[] = {4,3,5,5,2};
        missingnumber(arr);
       // System.out.println(Arrays.toString(arr));
    }

    static List<Integer> missingnumber(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

    List<Integer> ans = new ArrayList<Integer>();
    for (int index = 0 ; index < arr.length ; i++)
    {
        if(arr[index] != index + 1)
        {
            ans.add(index+1);
        }
    }

        return ans;
    }
    static void swap(int arr[], int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

