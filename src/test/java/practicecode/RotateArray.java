package practicecode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotatearray(arr, k)));
    }

    public static int[] rotatearray(int[] arr, int k) {

        int ans[] = new int[arr.length];
        for (int i = 0 ; i < arr.length; i++)
        {
            ans[(i+k)% arr.length] = arr[i];
        }

//        for (int i = 0 ; i < arr.length; i++)
//        {
//            arr[i]  = ans[i];
//        }

        return ans;
    }
}
