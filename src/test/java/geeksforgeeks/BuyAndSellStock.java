package geeksforgeeks;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        System.out.println(buyAndSell(arr));
    }

    public static int buyAndSell(int arr[])
    {
        int leastSofor = Integer.MAX_VALUE;
        int profitToday = 0;
        int overallProfit = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] < leastSofor)
            {
                leastSofor   = arr[i];
            }

            profitToday   =  arr[i] - leastSofor ;

            if(overallProfit < profitToday)
            {
                overallProfit = profitToday;
            }
        }

        return overallProfit;
    }
}
