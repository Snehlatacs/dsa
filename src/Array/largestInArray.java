package Array;
public class largestInArray {
    public static void main(String[] args) {
        int arr[] = {24, 4, 78, 10, 12, 14};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
