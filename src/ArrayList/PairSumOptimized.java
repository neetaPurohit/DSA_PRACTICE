package ArrayList;

import java.util.ArrayList;

public class PairSumOptimized {
    public static boolean twoPointerApproach(ArrayList<Integer> list, int target){
       int LP = 0;
       int RP = list.size()-1;
             //LP != RP
        while (LP < RP){

//          case : 1;
            if (list.get(LP) + list.get(RP) == target){
                return true;
            }
//          case : 2
            if (list.get(LP) + list.get(RP) < target){
                LP++;
            }else {
//          case : 3
                RP--;
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

        int target = 3;

        System.out.println(twoPointerApproach(list,target));
    }
}
