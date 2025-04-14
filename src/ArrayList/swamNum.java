package ArrayList;
import java.util.ArrayList;

public class swamNum {
    public static void swap(ArrayList<Integer> list, int x1, int x2){
        int temp = list.get(x1);
        list.set(x1, list.get(x2));
        list.set(x2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int x1 = 2, x2 = 4;
        System.out.println(list);
        swap(list, x1, x2);
        System.out.println(list);
    }
}
