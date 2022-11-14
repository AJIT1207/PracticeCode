package recursion;

import java.util.HashSet;

public class RepeatedTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()) {
            if(!set.add(ch))
                return ch;
        }
        throw new RuntimeException("s should contain at least one repeated letter");
        // can't reach to this line, because there must be a letter appearing TWICE
    }
}
