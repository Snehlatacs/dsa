package Recursion;

public class decreasingOrder {
    public static void main(String[] args) {
          int x = 10;
          printDecOrder(x);
    }

    private static void printDecOrder(int x) {
        if(x==0)
        {
            System.out.println(x);
            return;
        }
        System.out.print(x+" ");
        printDecOrder(x-1);
    }
}
