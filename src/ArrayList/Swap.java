package ArrayList;

import java.util.ArrayList;

public class Swap {              //int[]       arr,
    public static void swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));  //set value of idx1 to idx2
        list.set(idx2,temp);  //set value of idx2 to temp(which is idx1's value)
    }
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
                    //index
        list.add(2);//0
        list.add(4);//1
        list.add(6);//2
        list.add(8);//3
        list.add(10);//4
        System.out.println(list);

//        after swapping
        swap(list,0,4);
        System.out.println(list);
    }
}
