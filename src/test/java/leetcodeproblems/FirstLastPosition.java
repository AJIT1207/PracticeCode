package leetcodeproblems;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int arr[]  = {2,3,4,5,4,3};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int arr[], int target)
    {
        int ans[] = {-1,-1};

        ans[0] = search(arr, target, true);
       if(ans[0]!=0)
       {
           ans[1] = search(arr, target, false);
       }


        return ans;
    }

    static int search(int arr[], int target, boolean findindex)
    {
        int ans = -1;
        int first = 0;
        int last = arr.length-1;

        while (first <= last)
        {
            int mid = first + (last-first)/2;
            if(arr[mid] > target)
            {
                last = mid - 1;
            }

            else if(arr[mid] < target)
            {
                first  = mid + 1;
            }
            else
            {
                ans = mid;
                if(findindex)
                {
                    first = mid + 1;
                }
                else
                {
                    last = mid - 1;
                }
            }
        }
        return ans;
    }
}
