package ArrayList;
import java.util.*;
//import java.util.Collections;
//import java.util.HashMap;

public class lonelyNumber {

    //brute force Approach - O(n2)...
    private static ArrayList<Integer> lonelyNumberInListA(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for(int i = 0; i<list.size(); i++)
        {
            int num = list.get(i);
            int count = 0;

            for(int j = 0; j< list.size(); j++)
            {
                if(list.get(j) == num)
                {
                    count++;
                }
            }
           if(count == 1 && !list.contains(num-1) && !list.contains(num+1)){
               newList.add(num);
           }
        }
        return newList;
    }

    //Sort Based Approach - O(n log n)
    private static ArrayList<Integer> lonelyNumberInListB(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int i = 1; i< list.size()-1; i++)
        {
            if(list.get(i-1)+1< list.get(i)  && list.get(i)+1< list.get(i+1))
            {
                newList.add(list.get(i));
            }
        }

        if(list.size() == 1)
        {
            newList.add(list.get(0));
        }
        if(list.size()>1) {
            if (list.get(0) + 1 < list.get(1)) {
                newList.add(list.get(0));
            }
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                newList.add(list.get(list.size() - 1));
            }
        }
        return newList;
    }

    private static ArrayList<Integer> lonelyNumberInListC(ArrayList<Integer> list){
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        // Count the frequency of each number
        for (int num : list) {
           // freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> lonelyList = new ArrayList<Integer>();

        // Check lonely conditions
        for (int num : list) {
            if (freqMap.get(num) == 1 &&
                    !freqMap.containsKey(num - 1) &&
                    !freqMap.containsKey(num + 1)) {
                lonelyList.add(num);
            }
        }

        return lonelyList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println(lonelyNumberInListC(list));
    }
}

//https://chat.whatsapp.com/G0DAzGCIYPjAlC9AVF6Rzu
