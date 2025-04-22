package String;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(isAnagram(s1,s2))
        {
            System.out.println(s1+" and "+s2+" are Anagram");
        }
        else {
            System.out.println(s1+" and "+s2+" are not Anagram");
        }
    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2)){
                return true;
            }
        }
        return false;
    }
}
