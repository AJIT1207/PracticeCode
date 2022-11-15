package hackerrank;

public class MatricZeros {

    public static void main(String[] args) {

        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};

        matrixzero(arr);
    }

    static void matrixzero(int arr[][])
    {
        int col0 = 1, rows = arr.length, cols = arr[0].length;

        for (int i = 0 ; i < rows; i++)
        {
            if(arr[i][0] == 0)
            {
                cols = 0;
            }

            for (int j = 1 ; j < cols ; j++)
            {
                if(arr[i][j] == 0)
                {
                    arr[i][0] = arr[0][j] = 0;
                }
            }
        }


        for (int i = rows-1; i>=0; i--)
        {
            for (int j = cols-1 ; j>=1 ; j-- )
            {
                if(arr[i][0] == 0 ||  arr[0][j] == 0 )
                {
                    arr[i][j] = 0;
                }
            }
            if(col0 == 0)
            {
                arr[i][0] = 0;
            }
        }

        for (int i = 0 ; i < rows ; i++)
        {
            for (int j = 0 ; j < cols ; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
