package stack;
import java.util.*;

public class javaFrmWrkImpOfS {
    public static void main(String[] args) {
        Stack<Integer> imp = new Stack<Integer>();
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
