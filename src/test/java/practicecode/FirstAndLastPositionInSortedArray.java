package practicecode;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int arr[]  = {5,7,7,8,8,9};
        int target = 8;
        int ans[] = searchrange(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] searchrange(int arr[], int target)
    {
        int[] ans = {-1, -1};
        //check for first occurance if targert first
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
//        ans[0] = start;
//        ans[1] = end;
        return  ans;
    }

        //this function just returns the index value of target
      static  int search(int arr[], int target, boolean findstartindex)
        {
            int ans = -1;
            int start = 0;
            int end = arr.length-1;

            while(start <= end)
            {
                int mid = start + (end - start)/2;

                if(arr[mid] < target)
                {
                    start = mid + 1;
                }
                else if(arr[mid] > target)
                {
                    end = mid - 1;
                }
                else
                {
                    //potential ans found
                    ans = mid;
                    if(findstartindex)
                    {
                        end = mid-1;
                    }
                    else
                    {
                        start = mid + 1;
                    }
                }

            }
            return  ans;
        }
    }


