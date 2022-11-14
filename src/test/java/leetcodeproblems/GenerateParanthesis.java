package leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {

        List<String> answer = new ArrayList<>();

        generateAll ("", n, 0, 0, answer);
        return answer;
    }

    public static void generateAll (String s, int max, int openBracket, int closeBracket, List<String> answer) {

        if (s.length () == 2 * max) {
            answer.add (s);
        }
        if (openBracket < max) {
            generateAll (s + '(', max, openBracket + 1, closeBracket, answer);
        }
        if (closeBracket < openBracket) {
            generateAll (s + ')', max, openBracket, closeBracket + 1, answer);
        }
    }

}
