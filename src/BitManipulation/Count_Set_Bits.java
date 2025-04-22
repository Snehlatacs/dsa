package BitManipulation;
import java.util.Scanner;

public class Count_Set_Bits {
    public static int countSetBits(int num)
    {
        int count = 0;
        while(num>0){
            if((num & 1) != 0)
            {
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println(countSetBits(num));
    }
}
