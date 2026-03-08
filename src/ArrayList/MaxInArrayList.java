package ArrayList;

import java.util.ArrayList;

public class MaxInArrayList {
    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(31); //0
        list.add(26); //1
        list.add(83); //2
        list.add(40); //3
        list.add(53); //4

        int max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("max element = " + max);

    }
}
