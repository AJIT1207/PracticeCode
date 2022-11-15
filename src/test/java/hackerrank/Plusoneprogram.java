package hackerrank;

import java.util.Arrays;

public class Plusoneprogram {

    public static void main(String[] args) {
        int arr[] = {0,2,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        // int sum = 0;
        // int arr[] = new int[digits.length];

        for(int i = digits.length - 1 ; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                break;
            }
            else
            {
                digits[i] = 0;
            }
        }

        if(digits[0] == 0)
        {
            int result[] = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }



        return digits;
    }
}
