package ArrayList;
import java.util.ArrayList;

public class monotone {
    private static boolean isMonotonicList(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;

        for(int i = 0; i<list.size()-1; i++)
        {
            if(list.get(i) < list.get(i+1))
            {
                dec = false;
            }

            if(list.get(i) > list.get(i+1))
            {
                inc = false;
            }
        }

        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(36);
        list.add(28);
        list.add(19);
        list.add(19);
        list.add(11);
        list.add(5);

        System.out.println(isMonotonicList(list));
    }
}
