package hackerrank;

public class Diagnoaldiff {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{9,8,9}};
        int left_sum = 0;
        int right_sum = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
             left_sum +=  arr[i][i];
            right_sum += arr[i][arr.length-i-1];

        }

        int diff = Math.abs(right_sum - left_sum);

        System.out.println(diff);


    }
}
