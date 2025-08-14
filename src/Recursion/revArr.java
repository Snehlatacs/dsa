package Recursion;

import java.util.Scanner;

public class revArr {
    public static void printReverseArray(int[] arr, int l, int r) {
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        printReverseArray(arr, ++l, --r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int l = 0;
        int r = arr.length - 1;
        printReverseArray(arr, l, r);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
