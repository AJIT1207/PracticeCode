package geeksforgeeks;
//https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=1&curated[]=8&sortBy=submissions
import java.util.ArrayList;

public class Maximumofallarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int n = 9;
        int k = 3;
        System.out.println(max_of_subarrays(arr, n, k));
    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 0;
        for(int i = 0 ; i <= n-k; i++)
        {

            int temp = i;
            int j = i;
            while(temp < k+j)
            {
                max = Math.max(max, arr[temp]);
                temp++;
            }
            list.add(max);
        }

        return list;
    }
}