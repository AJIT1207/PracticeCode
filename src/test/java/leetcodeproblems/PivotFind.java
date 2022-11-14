package leetcodeproblems;

public class PivotFind {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int pivot  = findpivot(arr);
        System.out.println(pivot);
    }
    static int findpivot(int arr[])
    {
        int start = 0;
        int end  = arr.length - 1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(start < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(arr[mid-1] > arr[mid])
            {
                return mid - 1;
            }
            if(arr[start] <= arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start  = mid + 1;
            }
        }
        return -1;
    }
}
