package hackerrank;

public class UniqueelementXOR {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,1};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {

        int unique = 0;
        for (int i : arr)
        {
            unique = unique ^ i;
        }

        return unique;
    }
}
