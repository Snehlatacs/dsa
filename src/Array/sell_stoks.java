package Array;

public class sell_stoks {
    public static void main(String[] args) {
        int[] p = {7,1,5,3,6,4};
        System.out.println(maxProfit(p));
    }

    private static int maxProfit(int[] p) {
        int maxPro = 0;
        int buyP = Integer.MAX_VALUE;

        for(int i = 0; i<p.length; i++)
        {
            if(buyP<p[i])
            {
                int profit  = p[i] - buyP;
                maxPro = Math.max(maxPro, profit);
            }
           else
            {
                buyP=p[i];
            }
        }

        return maxPro;
    }
}
