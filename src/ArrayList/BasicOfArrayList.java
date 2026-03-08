package ArrayList;
import java.util.ArrayList;
public class BasicOfArrayList {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
//        add element in ArrayList T.c = O(1)
        list.add(31); //0
        list.add(26); //1
        list.add(83); //2
        list.add(40); //3
        list.add(53); //4
        System.out.println(list);

//        get element from ArrayList  T.c = O(1)
        int ele = list.get(4);
        System.out.println(ele);

//        delete element from ArrayList T.c = O(n)
        list.remove(4); //1 index
        System.out.println(list);

//        set element at index in ArrayList T.c = O(n)
        list.set(0,33); //store 33 at 0 index
        System.out.println(list);

//        contains(check whether ele. is present or not in an array) T.c = O(n)
        System.out.println(list.contains(83));

//        we can directly add element at any index using add T.c = O(n)
        list.add(4,67);
        list.add(1,0);
        System.out.println(list);

//        .size() method in ArrayList
        System.out.println(list.size());
//        print the ArrayList
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
