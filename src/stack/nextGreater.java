package stack;

import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[]= {6,8,0,1,3};
        Stack<Integer> s = new Stack<Integer>();
        int nxtGrtr[]= new int[arr.length];

        for(int i = arr.length-1; i>=0; i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxtGrtr[i] = -1;
            }
            else
            {
                nxtGrtr[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for (int i = 0; i< nxtGrtr.length; i++)
        {
            System.out.print(nxtGrtr[i]+" ");
        }
        System.out.println();
    }
}
