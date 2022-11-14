package practicecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int nums[] =    {42, 15, 12, 8, 6, 32};         //{2,7,11,15};
        int target = 20;
        System.out.println(Arrays.toString(twosum(nums, target)));
    }

    static int[] twosum(int nums[], int target)
    {
        int result[] = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }
}
