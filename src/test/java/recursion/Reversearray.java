package recursion;

public class Reversearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int size = arr.length;

        for (int i = size - 1; i >= 0; i--)
        {
            System.out.print(arr[i]);
        }
    }

}
