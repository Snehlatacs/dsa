package Mathematics;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int rem = 0;
//        int temp = n;
//        int count = 0;
//        int x = 0;
//        while(n>0)
//        {
//            rem  = n%10;
//            n = n/10;
//            x = 10*x+rem;
//        }
//        if(x==temp)
//        {
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not a palindrome");
//        }

        String c = sc.next();
        c = c.toLowerCase();
        int i = 0;
        int y = c.length()-1;

        while(i<y){
            if(c.charAt(i)!=c.charAt(y)){
                System.out.println("not palindrome string");
                System.exit(0);
            }
            i++;
            y--;
        }
        System.out.println("palindrome string");
    }



}
