package leetcodeproblems;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        int n = 19;
        System.out.println(happy(n));
    }

    static boolean happy(int n)
    {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                return false;
            }


            int sum = 0;
            while (n != 0) {
                sum = sum + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }


}
