package Recursion;
import java.util.Scanner;

public class sumNnum {
    public static void printSum(int n, int sum) {
        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        sum = sum+n;
        printSum(n-1, sum);
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int n = sc.nextInt();
   int sum = 0;
   printSum(n, sum);
   sc.close();
}
}
