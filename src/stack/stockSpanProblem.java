package stack;

import java.util.Stack;

public class stockSpanProblem {

    private static void stockSpan(int[] stock, int[] span) {
        Stack<Integer> s = new Stack<Integer>();
        span[0]=1;
        s.push(0);

        for(int i = 1; i< stock.length; i++)
        {
            int currP = stock[i];
            while(!s.isEmpty() && currP>stock[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i] = i+1;
            }
            else
            {
                int prevH = s.peek();
                span[i] = i-prevH;
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];

        stockSpan(stock,span);

        for(int i = 0; i< span.length; i++)
        {
            System.out.println(span[i] +"  ");
        }
    }
}
