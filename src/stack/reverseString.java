package stack;

import java.util.Stack;

public class reverseString {

    private static String reverseStr(String str) {
        Stack<Character> s = new Stack<Character>();
        int idx = 0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder rslt = new StringBuilder("");
        while (!s.isEmpty())
        {
            char ch = s.pop();
            rslt.append(ch);
        }
        return rslt.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String rslt = reverseStr(str);
        System.out.println(rslt);
    }

}
