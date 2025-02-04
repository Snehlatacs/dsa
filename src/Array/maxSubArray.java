package Array;

public class maxSubArray {
    public static void main(String[] args) {
        int arr[] = {1, -4, 6, -12, 10};
        //maxSubArrayprint(arr);
        //maxSubArraypnt(arr);
        kadensAlgo(arr);
    }

    private static void maxSubArrayprint(int[] arr) {
        int maxS = 0;

        for (int i = 0; i<arr.length; i++)
        {
            for (int j = i; j< arr.length; j++)
            {
                int currS = 0;
                for (int k = i; k<=j; k++)
                {
                    currS += arr[k];
                }
                System.out.println(currS);
                maxS = Math.max(currS, maxS);
            }
        }
        System.out.println("maxsum:"+maxS);
    }

    private static void maxSubArraypnt(int[] arr) {
        int maxS = 0;

        for (int i = 0; i<arr.length; i++)
        {
            int currS = 0;
            for (int j = i; j< arr.length; j++)
            {
                currS+=arr[j];
                //System.out.println(currS);
                maxS = Math.max(currS, maxS);
            }
        }
        System.out.println("maxsum:"+maxS);
    }

    private static void kadensAlgo(int[] arr) {
        int maxS = 0;
        int currS = 0;
        for (int i = 0; i<arr.length; i++)
        {
            currS+=arr[i];
            System.out.println(currS);
            if(currS<0){
                currS = 0;
            }

            maxS = Math.max(currS, maxS);
        }
        System.out.println("maxsum:"+maxS);
    }
}
