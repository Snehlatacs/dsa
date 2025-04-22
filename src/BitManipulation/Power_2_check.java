package BitManipulation;
import java.util.Scanner;

public class Power_2_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(check2Power(n));
    }

    private static boolean check2Power(int n) {
        if(n==0) return false;
        else return (n & (n-1)) == 0;
    }
}
