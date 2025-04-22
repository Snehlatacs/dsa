package BitManipulation;

import java.util.Scanner;

public class Get_Ith_Bit {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the Value of i:");
        int i = sc.nextInt();
        int bitmask = (1<<i);
        System.out.print("The ith value of the "+x+" is:");
        if((x&bitmask)==0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1);
        }
    }
}
