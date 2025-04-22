package BitManipulation;


import java.util.Scanner;

public class ClearIthBit {
    public static int Clear_Ith_Bit(int x, int i) {
        int bitMask = ~(1<<i);
        return x & bitMask;
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter ith position: ");
        int p = sc.nextInt();
        System.out.println(Clear_Ith_Bit(x,p));
    }
}
