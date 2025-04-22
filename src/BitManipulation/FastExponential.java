package BitManipulation;
import java.util.Scanner;

public class FastExponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter the value of power");
        int n = sc.nextInt();
        System.out.println(fast_exponential(a,n));
    }

    public static int fast_exponential(int a, int n) {
        int ans = 1;
        while(n>0){
            if((n&1)!=0)
            {
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
}
