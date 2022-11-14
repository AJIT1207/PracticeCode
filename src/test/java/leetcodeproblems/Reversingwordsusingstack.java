package leetcodeproblems;

import java.util.Stack;

public class Reversingwordsusingstack {
    public static void main(String[] args) {
        String s = "Ajit Kumar Jaiswal";
        s = s + " ";

        Stack<String> stack  = new Stack<>();
        String str = "";

        for (int i = 0 ; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                stack.push(str);
                str = "";
            }
            else
            {
                str = str + s.charAt(i);
            }
        }

        String ans = "";

        while (stack.size() != 1)
        {
            ans = ans + stack.peek() + " ";
            stack.pop();
        }

        ans = ans + stack.peek();
        System.out.println("After reversing the words ");
        System.out.println(ans);





    }
}
