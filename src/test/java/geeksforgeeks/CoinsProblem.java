package geeksforgeeks;

import java.util.Arrays;

public class CoinsProblem {
    public static void main(String[] args) {

        int sum = 4;

        int coins[] = {1,2,3};
        int N = coins.length;
        System.out.println(count(coins, N, sum));
    }

    public static long count(int coins[], int N, int sum)
    {
        long dp[] = new long[5];

        Arrays.fill(dp, 0);
        dp[0] = 1;

        for (int i = 0 ; i < N; i++)
        {
            for (int j = coins[i]; j <= sum; j++)
            {
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }

        return dp[sum];
    }
}
