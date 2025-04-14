package ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;

public class basicOperation {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.get(3));

        list.remove(2);
        list.set(2, 13);
        System.out.println(list.contains(11));

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
