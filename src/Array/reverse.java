package Array;

public class reverse {
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 10, 12, 14};
        int i = 0;
        int n = arr.length-1;
        while( i < n)
        {
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;

            i++;
            n--;
        }
        for(int k = 0; k< arr.length; k++)
        {
            System.out.print(arr[k]+" ");
        }

        System.out.println();
    }
}
