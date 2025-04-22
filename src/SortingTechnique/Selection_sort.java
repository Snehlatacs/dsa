package SortingTechnique;

public class Selection_sort {
    public static void selectionSort(int[] arr) {
        for(int i = 0; i<arr.length-1; i++)
        {
            int minElemPos  = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[minElemPos]>arr[j]){ // reverse condition for reverse order
                   minElemPos = j;
                }
            }
            int temp = arr[minElemPos];
            arr[minElemPos] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        printArr(arr);
    }
}
