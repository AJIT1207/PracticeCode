package maze;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5};
        System.out.println(missingquicksort(arr));
    }

    public static int missingquicksort(int arr[])
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i]-1;  //
            if(arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

        for (int index = 0 ; index < arr.length; index++)
        {
            if(arr[index] != index+1)  // arr[2] != 2
            {
                return index+1;
            }
        }
        return arr.length+1;


    }
    public static void swap(int arr[], int i, int correct)
    {
        int temp  = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
