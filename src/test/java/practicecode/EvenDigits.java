package practicecode;

public class EvenDigits {
    public static void main(String[] args) {
        int arr[] = {12,345,1234,5,123456};
        System.out.println(evenDigit(arr));
    }

    public static int evenDigit(int[] arr)
    {
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(i % 2 == 0 )
            {
                count ++;

            }
        }
        return  count;
    }
}
