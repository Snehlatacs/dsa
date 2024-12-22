package stack;
import java.util.*;

public class arrayListImpOfStack {
    public static class stackA
    {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public boolean isEmpty()
        {
            return list.size()==0;
        }
        public void push(int data)
        {
            list.add(data);
        }
        public int pop()
        {
            int top  = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek()
        {
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stackA imp = new stackA();
        imp.push(4);
        imp.push(3);
        imp.push(2);
        imp.push(1);
        while(!imp.isEmpty())
        {
            System.out.print(imp.peek()+"->");
            imp.pop();
        }
        System.out.println("null");
    }
}
