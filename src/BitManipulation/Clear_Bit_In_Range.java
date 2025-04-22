package BitManipulation;

import java.util.Scanner;

public class Clear_Bit_In_Range {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter i position: ");
        int i = sc.nextInt();
        System.out.println("Enter j position: ");
        int j = sc.nextInt();
        System.out.println(clearBitInRange(num,i,j));
    }

    public static int clearBitInRange(int num, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return num&bitMask;
    }
}
