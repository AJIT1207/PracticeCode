package geeksforgeeks;

import java.util.HashSet;
import java.util.Set;

public class CommonElementinthreeArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {2,3,4,5};
        int c[] = {3,4,5,6};


        Set<Integer> setA = new HashSet<>();

        for (Integer i : a)
        {
            setA.add(i);
        }

        Set<Integer> setB = new HashSet<>();
        for (Integer j : b)
        {
            setB.add(j);
        }

        Set<Integer> setC = new HashSet<>();
        for (Integer k : c)
        {
            setC.add(k);
        }

        setA.retainAll(setB);
        setA.retainAll(setC);

        System.out.println(setA);

    }
}
