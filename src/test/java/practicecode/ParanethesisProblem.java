package practicecode;

import java.util.Stack;

public class ParanethesisProblem {
    public static void main(String[] args) {
        String s = "((())){";
        System.out.println(checkParanthesis(s));
    }

    public static boolean checkParanthesis(String s)
    {
        Stack<Character> stk = new Stack<>();
        char ch[] = s.toCharArray();
        for (int i = 0 ; i < ch.length; i++)
        {
            if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[')
            {
                stk.push(ch[i]);
            }

            else
            {
                if(stk.isEmpty())
                {
                    return false;
                }
                else if(ch[i] == '(' && stk.peek() != ')')
                {
                    return false;
                }
                else if(ch[i] == '{' && stk.peek() != '}')
                {
                    return false;
                }
                else if(ch[i] == '[' && stk.peek() != ']')
                {
                    return false;
                }
                stk.pop();
            }


        }

        return stk.isEmpty();
    }
}
