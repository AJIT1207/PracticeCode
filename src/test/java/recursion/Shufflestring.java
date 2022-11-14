package recursion;

import java.util.Locale;

public class Shufflestring {
    public static void main(String[] args) {
        int indices[] =  {4,5,6,7,0,1,2,3};
        System.out.println(restoreString("codeleet", indices));

        String word = "AJIT";
        char ch[] = word.toLowerCase().toCharArray();
    }

    public static String restoreString(String s, int[] indices) {
        int length = s.length();
        char arr[] = new char[length];
        for(int i = 0 ; i < length ; i++)
        {
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);
    }

}
