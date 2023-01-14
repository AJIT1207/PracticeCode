package leetcodeproblems;

public class

FirstPositionBS {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,1,1,1,1};
        int target = 1;
        System.out.println(firstandlast(arr, target));
    }

    public static int firstandlast(int arr[], int target)
    {
        int result = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                result = mid;

                end = mid - 1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end  = mid - 1;
            }
        }

        return result;
    }

}
