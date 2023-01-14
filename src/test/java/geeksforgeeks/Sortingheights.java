package geeksforgeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sortingheights {

    public static void main(String[] args) {

        String names[] = {"Mary", "John", "Emma"};
        int heights[] = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    public static String[] sortPeople(String names[], int heights[])
    {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0 ; i < names.length; i++)
        {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int counter = 0;
        for (int i = names.length-1 ; i >=0; i--)
        {
            String newname = map.get(heights[i]);
            names[counter++] = newname;
        }

        return  names;
    }
}
