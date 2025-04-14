package ArrayList;
import java.util.*;
import java.util.Collection;

public class collectionSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
