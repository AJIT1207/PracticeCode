package practicecode;

public class PositionElementSortedInfinteArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));

    }
    static int ans(int arr[], int target)
    {
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to be lie in the range
        while (target > arr[end])
        {
            int temp  = end + 1; // this is my new start
            //double the box value
            // end = previous end + sizeofbox * 2;

            end = end + (end - start + 1) * 2;  // e - (s-1)
            start = temp;

    }
        return binarysearchinfinitearray(arr, target, start, end);
}
        public static int binarysearchinfinitearray(int[] arr, int target, int start, int end) {
//            int start  = 0;
//            int end = arr.length-1;

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
