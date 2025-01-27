package stack;
import java.util.*;

public class pushAtBottom {

    public static void popAtBotm(Stack<Integer> s, int i) {
        int idx = 0;
        if(s.isEmpty())
        {
            s.push(i);
            return;
        }
        int top = s.pop();
        popAtBotm(s,i);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty())
        {
            System.out.print(s.pop()+"->");
        }
        popAtBotm(s,4);
        while (!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }

    }

}
