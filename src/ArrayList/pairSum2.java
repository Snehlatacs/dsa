package ArrayList;
import java.util.ArrayList;

public class pairSum2 {
    //Optimized Approach --> 2-Pointer Approach O(n)
    public static boolean isPairSum2B(ArrayList<Integer> list, int target) {
        int breakPoint = -1;
        int n = list.size();
        for(int i = 0; i<n; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                breakPoint = i;
                break;
            }
        }

        int leftPointer = breakPoint+1;
        int rightPointer = breakPoint;

        while(leftPointer!=rightPointer)
        {
            if (target == (list.get(leftPointer) ) + (list.get(rightPointer)))  return true;

            if(target > list.get(leftPointer) + list.get(rightPointer))
            {
                leftPointer = (leftPointer + 1) % n;
            }
            else{
                rightPointer  = (n + rightPointer - 1) % n;
            }
        }

        return false;
    }

    //Brute force Approach - O(n2)
    public static boolean isPairSum2A(ArrayList<Integer> list, int target) {
        for(int i = 0; i< list.size(); i++)
            for (int j = i + 1; j < list.size(); j++)
                if (target == (list.get(i) )+ (list.get(j))) return true;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Sorted and Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 19;

        System.out.println(isPairSum2B(list, target));
    }
}
