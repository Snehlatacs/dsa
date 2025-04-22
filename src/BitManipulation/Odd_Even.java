package BitManipulation;

import java.util.Scanner;

public class Odd_Even {
    public static void OddEven(int x)
    {
        int bitMask = 1;
        if((x&bitMask)==0)
        {
            System.out.println("Even NUmber");
        }
        else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check Odd or Even");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        OddEven(x);
    }
}
