package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>1)
        {
            fact = n*fact;
            n--;
        }
        System.out.println(fact);
    }
}
