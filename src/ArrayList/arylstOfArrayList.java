package ArrayList;

import java.util.ArrayList;

public class arylstOfArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//
//
//        list2.add(2);
//        list2.add(4);
//        list2.add(6);
//        list2.add(8);
//        list2.add(10);
//
//
//        list3.add(3);
//        list3.add(6);
//        list3.add(9);
//        list3.add(12);
//        list3.add(15);


        for(int k = 1; k<=5; k++)
        {
            list1.add(k*1);
            list2.add(k*2);
            list3.add(k*3);
        }


        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for(int i = 0; i<mainList.size(); i++)
        {
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j = 0; j<currentList.size(); j++){
                System.out.print(currentList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
