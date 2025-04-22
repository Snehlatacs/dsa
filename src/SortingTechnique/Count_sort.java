package SortingTechnique;

public class Count_sort {

    private static void countSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
            }
        }

        int[] count = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++)
        {
            while (count[i]>0)
            {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3};
        countSort(arr);
        printArr(arr);
    }
}
