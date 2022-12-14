package recursion;

public class FlipImage
{
    public static void main(String[] args) {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flipAndInvertImage(image));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int  i = 0 ; i < image.length ; i++)
        {
            int low = 0;
            int high = image.length - 1;

            while(low <= high)
            {
                if(image[i][low] == image[i][high])
                {
                    image[i][low] = 1 - image[i][low];
                    image[i][high] = image[i][low];
                }

                low++;
                high--;
            }
        }

        return image;
    }
}



