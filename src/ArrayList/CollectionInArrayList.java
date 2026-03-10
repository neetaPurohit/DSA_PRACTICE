package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionInArrayList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);

//        after sorting
        Collections.sort(list);//ascending order
        System.out.println(list);

//        descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
