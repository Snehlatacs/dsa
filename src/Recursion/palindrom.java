package Recursion;
import java.util.Scanner;

public class palindrom {
    public static boolean pali(String s, int l, int r){
       if(l>=r){
        return true;
       }
       if(s.charAt(l) != s.charAt(r)){
        return false;
       }
       return pali(s, ++l, --r);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter palindromic character: ");
    String s = sc.nextLine();
    int x = 0; 
    int y = s.length() - 1;
    System.out.println(pali(s, x, y));
    sc.close();
}
}
