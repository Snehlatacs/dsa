package stack;
import java.util.Stack;

import static stack.pushAtBottom.popAtBotm;

public class reverseStack {

    public static void reverseStk(Stack<Integer> s) {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        reverseStk(s);
        popAtBotm(s,top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty())
        {
            System.out.print(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStk(s);
        printStack(s);


    }
}
