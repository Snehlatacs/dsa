package ArrayList;
import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //time-comp => O(n)
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
