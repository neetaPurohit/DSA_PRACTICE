package ArrayList;

import java.util.ArrayList;

public class Multi_DimensionalArray {
    static void main(String[] args) {
//        creating main list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

//        creating inner list for main list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        add list to main list
        mainList.add(list);

//        list = 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        mainList.add(list2);


//        iteration on lists
        for (int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
//        printing lists
            for (int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
}
