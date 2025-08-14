package Recursion;
import java.util.Scanner;

public class printNameNtimes {
    public static void printName(String naam, int i){
        if(i==naam.length()){
            return;
        }
        System.out.println( i+"."+naam);
        printName(naam, i+1);
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a name: "); 
   String name = sc.nextLine();
   int i = 1;
   printName(name, i);
   sc.close();
}
}
