package practicecode;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

   static int search(int arr[], int target)
    {
        int peak = peakinderx(arr);
        int firsttry = orderagnoticbinaryseacr(arr, target, 0, peak);
        if(firsttry != -1)
        {
            return firsttry;
        }
        return orderagnoticbinaryseacr(arr, target, peak+1, arr.length-1);
}
    static int peakinderx(int arr[]) {

        int start = 0 ;
        int end = arr.length-1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }


    static int orderagnoticbinaryseacr(int arr[], int target, int start, int end)
    {
//        int start = 0;
//        int end =  arr.length-1;
        boolean isasc = arr[start] < arr[end];

        while(start <=end)
        {
            int mid =  start + (end-start)/2;

            if(arr[mid] == target)
            {
                return  mid;
            }

            if(isasc)
            {
                if(arr[mid] < target )
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid-1;
                }
            }

            else
            {
                if(arr[mid] > target )
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid-1;
                }
            }

        }

        return -1;
    }
}