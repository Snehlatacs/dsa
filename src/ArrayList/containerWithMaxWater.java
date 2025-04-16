package ArrayList;
import java.util.ArrayList;

public class containerWithMaxWater {

    //Optimaized Approach --> 2-Pointer Approach - O(n)
    public static int maxWaterB(ArrayList<Integer> heights){
        int maxArea = 0;
        int leftHeight = 0;
        int rightHeight = heights.size()-1;
        while(leftHeight < rightHeight){
            int minHeight = Math.min(heights.get(leftHeight), heights.get(rightHeight));
            int width = rightHeight-leftHeight;
            int currentArea = minHeight*width;
            maxArea = Math.max(maxArea, currentArea);
            if(heights.get(leftHeight)<heights.get(rightHeight)){
                leftHeight++;
            }else{
                rightHeight--;
            }
        }
        return maxArea;
    }

    //Brute force Approach - O(n2)
    public static int maxWaterA(ArrayList<Integer> heights)
    {
        int maxArea = 0;
        for(int i = 0; i<heights.size(); i++)
        {
            for(int j = i+1; j<heights.size(); j++)
            {
                int minHeight = Math.min(i, j);
                int width = j-1;
                int currentArea = minHeight*width;
                maxArea = Math.max(maxArea, currentArea);
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(maxWaterB(list));
    }
}
