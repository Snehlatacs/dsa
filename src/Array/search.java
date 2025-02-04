package Array;

public class search {
    public static void main(String[] args) {
      int arr[] = {2, 4, 8, 10, 12, 14};
      int key = 14;
        System.out.println(inearSearch(arr, key));
        System.out.println(bSearch(arr, key));
    }

    private static int bSearch(int[] arr, int key) {
        int x = 0;
        int y = arr.length-1;
        while(x<=y)
        {
            int mid = (x+y)/2;
            if(key == arr[mid])
            {
                return mid;
            }
            if(key>arr[mid])
            {
                x = mid+1;
            }
            if(key<arr[mid])
            {
                y = mid-1;
            }

        }
        return -1;
    }

    private static int inearSearch(int[] arr, int key) {
        for(int i = 0; i< arr.length; i++)
        {
            if(key == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
