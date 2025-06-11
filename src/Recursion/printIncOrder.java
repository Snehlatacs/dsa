package Recursion;

public class printIncOrder {
    public static void main(String[] args) {
        int c = 5;
        printIncreasingOrder(c);
    }

    private static void printIncreasingOrder(int c) {
        if(c == 1)
        {
            System.out.print(c+" ");
            return;
        }
        printIncreasingOrder(c-1);
        System.out.print(c+" ");
    }
}
