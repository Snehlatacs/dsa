package Recursion;
import java.util.Scanner;

public class reverseNum {
    public static void printReverseNum(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        printReverseNum(x-1);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x = sc.nextInt();
    printReverseNum(x);
    sc.close();
}
}
