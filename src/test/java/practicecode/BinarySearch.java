package practicecode;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-3,-2,-1,1,2,3,4,5};
        int target = -11;
        System.out.println(binarysearch(arr, target));
    }
    //order agnostic search when we are not aware about the array is sorted in ascending or descending order
    public static int binarysearch(int[] arr, int target) {
        int start  = 0;
        int end = arr.length-1;

        while(start <=end)
        {
            int mid  = start + (end - start)/2;

            if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else if (arr[mid] > target)
            {
                end  = mid-1;
            }
            else
            {
                return  mid;
            }

        }

        return  -1;
    }
}
