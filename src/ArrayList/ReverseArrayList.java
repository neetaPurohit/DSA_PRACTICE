package ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(31); //0
        list.add(26); //1
        list.add(83); //2
        list.add(40); //3
        list.add(53); //4

//  T.c = O(n)
        for (int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
