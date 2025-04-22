package BitManipulation;

import java.util.Scanner;

public class Set_Ith_Bit {
        public static void main(String[] args) {
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("Enter the Value of i:");
            int i = sc.nextInt();
            System.out.println(setIthBit(x,i) );
        }

    public static int setIthBit(int x, int i) {
            int bitMask = (1<<i);
            return x|bitMask;
    }
}
