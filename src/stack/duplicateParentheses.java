package stack;

import java.util.Stack;

public class duplicateParentheses {

    private static boolean isDuplicate(String str) {
        Stack<Character> s= new Stack<Character>();

        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == ')')
            {
                int count = 0;
                while(s.peek()!='(')
                {
                    s.pop();
                    count++;
                }
                if (count<1)
                {
                    return true;
                }
                else
                {
                    s.pop();
                }
            }
            else
            {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str2));
    }

}
