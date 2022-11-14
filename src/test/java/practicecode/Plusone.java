package practicecode;

import java.util.Arrays;

public class Plusone {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;
        while(n%3 == 0)
        {
            n = n/3;
        }

        return n == 1;
    }
}