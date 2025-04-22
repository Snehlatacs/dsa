package SortingTechnique;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {
    public static void printArr(Integer[] arr) {
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3};
//        Arrays.sort(arr);
//        printArr(arr);
//        Arrays.sort(arr,1,5);
//        printArr(arr);
//        Arrays.sort(arr, Collections.reverseOrder());
//        printArr(arr);
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        printArr(arr);
    }
}
