package BitManipulation;

import java.util.Scanner;

public class CLear_Last_I_Bit {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter i position: ");
        int i = sc.nextInt();
        System.out.println(clearLastIthBit(x,i));
    }

    public static int clearLastIthBit(int x, int i) {
        int bitMask = -1<<i;
        return x&bitMask;
    }
}
