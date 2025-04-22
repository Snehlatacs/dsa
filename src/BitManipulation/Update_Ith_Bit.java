package BitManipulation;
import java.util.Scanner;

import static BitManipulation.ClearIthBit.Clear_Ith_Bit;
import static BitManipulation.Set_Ith_Bit.setIthBit;

public class Update_Ith_Bit {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter ith position: ");
        int p = sc.nextInt();
        System.out.println("Enter ith bit: ");
        int i = sc.nextInt();
        System.out.println(updateIthBit(x,p,i));
    }

    public static int updateIthBit(int num, int position, int newBit) {
        if(newBit==0)
        {
            return Clear_Ith_Bit(num,position);
        }
        else{
            return setIthBit(num,position);
        }

//        //if the required first step is to clear the ith bit...
//        num = Clear_Ith_Bit(num,position);
//        int bitMask = newBit<<position;
//        return num|bitMask;

    }

}
