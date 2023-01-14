package geeksforgeeks;

public class MinJumps {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,6,7};
        System.out.println(minJumps(arr));
    }

    public static int minJumps(int arr[])
    {
        if(arr.length == 0)
        {
            return 0;
        }

        if(arr[0] == 0)
        {
            return -1;
        }

        //initialization
        int maxReach = arr[0];
        int steps = arr[0];
        int jump  = 1;

        for (int i = 1; i < arr.length; i++)
        {
            if(i == arr.length - 1)
            {
                return jump;
            }

            maxReach = Math.max(maxReach, i+ arr[i]);

            steps--;

            if(steps == 0)
            {
                jump++;

                if(i >= maxReach)
                {
                    return -1;
                }

                steps = maxReach - i;
            }
        }

        return -1;
    }
}
