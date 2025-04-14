package Mathematics;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int temp = n;
        int count = 0;
        int x = 0;
        while(n>0)
        {
            rem  = n%10;
            n = n/10;
            if(rem!=0)
            {
                x = temp%rem;
                if(x==0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
