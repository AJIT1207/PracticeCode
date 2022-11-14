package practicecode;
//order agnostic when not aware about the order of array
public class AgnosticBinarySearch {
    public static void main(String[] args) {
       // int arr[] = {19,14,8,6,3,2,1};
        int arr[] = {-3,-2,-1,1,2,3,4,5};
        int target = 3;
        System.out.println(orderagnoticbinaryseacr(arr,target));

    }

    static int orderagnoticbinaryseacr(int arr[], int target)
    {
        int start = 0;
        int end =  arr.length-1;
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
