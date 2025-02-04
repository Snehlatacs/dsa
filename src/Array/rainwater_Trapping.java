package Array;

public class rainwater_Trapping {
    public static void main(String[] args) {
        int[] h = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rainwaterTrapping(h));
    }

    private static int rainwaterTrapping(int[] h) {
        int sum = 0;
        int n = h.length;

        int[] arr1 = new int[n];
        arr1[0] = h[0];
        for(int i  = 1 ; i<n; i++)
        {
            arr1[i] = Math.max(arr1[i-1],h[i]);
            //System.out.print("maxL=>"+arr1[i]+"("+i+") ");
        }

        //System.out.println();

        int[] arr2 = new int[n];
        arr2[n-1] = h[n-1];
        for(int i  = n-2 ; i>=0; i--)
        {
            arr2[i] = Math.max(arr2[i+1],h[i]);
            //System.out.print("maxR=>"+arr2[i]+"("+i+") ");
        }

        //System.out.println();

        for(int k = 0; k<n; k++ ){
            int wl = Math.min(arr1[k],arr2[k]);
            //System.out.print("("+wl+")");
            sum += wl-h[k];
            //System.out.print(sum+"+");
        }
        //System.out.println();
        return sum;
    }
}
