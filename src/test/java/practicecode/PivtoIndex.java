package practicecode;

public class PivtoIndex {
    public static void main(String[] args) {
       // int arr[]  = {4,5,6,7,0,1,2};
       // System.out.println(pivot(arr));
        int arr[]  = {1,7,3,6,5,6};
        System.out.println(pivotDuplicates(arr));
    }

     static int pivot(int[] arr) {
       int start = 0;
       int end = arr.length-1;

       while (start <= end)
       {
           int mid = start + (end - start)/2;

           // 4 cases over here
           if(mid < end && arr[mid] > arr[mid+1])
           {
               return mid ;
           }
           else if (mid > start && arr[mid] < arr[mid-1])
           {
               return mid - 1;
           }

           if(arr[mid] <= start)
           {
               end = mid -1;
           }
           else
           {
               start = mid + 1;
           }


       }
       return -1;
    }

    static int pivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = start + (end - start)/2;

            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid ;
            }
            else if (mid > start && arr[mid] < arr[mid-1])
            {
                return mid - 1;
            }

            //if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                // what if these elements at start and end were the pivto?
                // check if start is pivot

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check whether end is pivot
                if (arr[end] < arr[end-1])
                {
                    return end - 1;
                }

                end --;


            }

            //left side is sorted so pivot should be in right
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
            {
                start  = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }
        return -1;
    }

}
