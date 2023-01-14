package leetcodeproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;



public class DuplicateCharsStream {

    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gessek";

        System.out.println(editDistance(s1, s2));
    }

    public static int editDistance(String s1, String s2) {

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int insert = dp[i][j - 1] + 1;
                    int delete = dp[i - 1][j] + 1;
                    int replace = dp[i - 1][j - 1] + (s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1);

                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }

        return dp[s1.length()][s2.length()];

    }   }