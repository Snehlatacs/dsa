package ArrayList;
import java.util.ArrayList;

public class pairSum1 {

    //Optimized Approach --> Two Pointer Approach O(n)
    public static boolean isPairSumB(ArrayList<Integer> ele, int target)
    {
        int left = 0;
        int right = ele.size()-1;
        while(left!=right)
        {
            if(ele.get(left)+ele.get(right) == target)
            {
                return true;
            }

            if(ele.get(left)+ele.get(right) < target)
            {
                left++;
            }else
            {
                right--;
            }
        }
        return false;
    }

    //Brute force Approach - O(n2)
    public static boolean isPairSumA(ArrayList<Integer> ele, int target)
    {
        for(int i = 0; i< ele.size(); i++)
            for (int j = i + 1; j < ele.size(); j++)
                if (target == (ele.get(i) + ele.get(j))) {
                    return true;
                }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(15);

        int target = 19;

        System.out.println(isPairSumB(list, target));
    }
}
