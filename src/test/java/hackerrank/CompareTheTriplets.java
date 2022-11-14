package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(5,6,7);
        List<Integer> b = Arrays.asList(3,6,10);

        System.out.println(compareTriplets(a,b));

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        int Alice = 0;
        int Bob = 0;
        for(int i = 0 ; i < a.size(); i++)
        {
            if(a.get(i) > b.get(i))
            {
                Alice++;
            }
            else if(a.get(i) < b.get(i))
            {
                Bob++;
            }

        }

        list.add(Alice);
        list.add(Bob);

        return list;
    }

}

