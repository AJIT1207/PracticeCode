package hackerrrankproblems;


import java.util.ArrayList;
import java.util.List;

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621
public class Subarraywithgivensum {

    public static void main(String[] args) {

        int N = 5, S = 12;
        int arr[] = {1,2,3,7,5};

        System.out.println(subarraySum(arr, N, S));

    }

    public static List<Integer> subarraySum(int arr[], int N, int s)
    {

        List<Integer> list = new ArrayList<>();
        int start = 0;
        int last = 0;
        int curr_sum = 0;
        boolean flag = false;

        for (int i = 0 ; i < N; i++)
        {
            curr_sum = curr_sum + arr[i];

            if(curr_sum >=s)
            {
                last = i;
                while (s < curr_sum  && start < last)
                {
                    curr_sum = curr_sum - arr[start];
                    ++start;
                }
                if (curr_sum == s)
                {
                    list.add(start + 1);
                    list.add(last + 1);
                    flag = true;

                    break;

                }
            }
        }

        if(flag == false)
        {
            list.add(-1);
        }

        return list;
    }
}
