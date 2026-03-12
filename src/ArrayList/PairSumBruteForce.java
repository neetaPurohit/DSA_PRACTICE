package ArrayList;

import java.util.ArrayList;

public class PairSumBruteForce {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        for (int i=0; i<list.size(); i++){ //first element
            for (int j=i+1; j<list.size(); j++){ //second element
                if (list.get(i) + list.get(j) == target){
                    System.out.println("Index " +list.get(i) + " and index " + list.get(i+1) + "'s sum is equal to: " + target);
                    return true;
                }
            }
        }
        return false;
    }
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.add(5);//4
        list.add(6);//5
        int target = 5;

        System.out.println(pairSum1(list,target));
    }
}
