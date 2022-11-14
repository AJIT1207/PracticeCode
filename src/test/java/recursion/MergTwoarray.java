package recursion;

public class MergTwoarray {
    public static void main(String[] args) {
     int arr1[] = {2,1,3,4};
     int arr2[] = {6,5,7,8};
     int merged[] = new int[arr1.length + arr2.length];
     int x = 0, y = 0, z = 0;
     for(int i = 0 ; i < merged.length; i++)
     {
         while(x < arr1.length && y < arr2.length)
         {
             if(arr1[x] < arr2[y])
             {
                 merged[z] = arr1[x];
                 z++;
                 x++;
             }

             else
             {
                 merged[z] = arr2[y];
                 z++;
                 y++;
             }
         }

         while (x < arr1.length)
         {
             merged[z] = arr1[x];
             z++;
             x++;
         }

         while (y < arr2.length)
         {
             merged[z] = arr2[y];
             z++;
             y++;
         }
     }

     for (int i = 0 ; i < merged.length; i++)
     {
         System.out.println(merged[i]);
     }
    }
}
