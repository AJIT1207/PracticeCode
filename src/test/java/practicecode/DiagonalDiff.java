package practicecode;

public class DiagonalDiff {
    public static void main(String[] args) {
        int arr[][] = {{11, 2, 4},
                       {4, 5, 6},
                       {10, 8, -12}};

        int left_sum = 0;
        int right_sum = 0;
        int len = arr.length;

        for(int i = 0 ; i < len ; i++)
        {
            left_sum =  left_sum + arr[i][i];
            right_sum = right_sum + arr[i][len-1-i];
        }

        int ans = Math.abs(left_sum-right_sum);
        System.out.println(ans);


    }
}