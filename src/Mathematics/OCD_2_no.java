package Mathematics;

import java.util.Scanner;

public class OCD_2_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ocd = 0;
        int min = Math.min(a,b);
        for(int i = min; i>0; i--)
        {
            if(a%i==0 && b%i==0){
                ocd = i;
                break;
            }
        }
        System.out.println(ocd);
        int lcm = (a*b)/ocd;
        System.out.println("lcm:"+lcm);
    }
}
