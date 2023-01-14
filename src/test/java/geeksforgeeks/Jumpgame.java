package geeksforgeeks;

public class Jumpgame {

    public static void main(String[] args) {

        int arr[] = {2,3,1,1,4};

        System.out.println(canJump(arr));
    }

    public static boolean canJump(int arr[])
    {
        int lastjum = 0;
        for (int i = arr.length-1 ; i >=0 ;i--)
        {
            if(i+arr[i] >= lastjum)
            {
                lastjum = i;
            }

        }

        return lastjum == 0;
    }
}
