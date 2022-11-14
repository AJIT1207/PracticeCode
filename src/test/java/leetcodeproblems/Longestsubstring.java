//package leetcodeproblems;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class Longestsubstring {
//    public static void main(String[] args) {
//        String s = "abcabcbb";
//        System.out.println(substring(s));
//    }
//
//    static int substring(String s)
//    {
//
//        int max = 0;
//        Set<Character> set   = new HashSet<>();
//        char ch[] = s.toCharArray();
//        while( j < s.length())
//        {
//            if(!set.contains(c))
//            {
//                    set.add(c++);
//                    max = Math.max(max, set.size());
//                    System.out.println(max);
//            }
//            else
//            {
//                set.remove(c++);
//            }
//        }
//    return max;
//    }
//}
