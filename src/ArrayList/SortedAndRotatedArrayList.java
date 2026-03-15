package ArrayList;

import java.util.ArrayList;

public class SortedAndRotatedArrayList {
    //TC = O(n)
    public static  boolean sortedRotatedArrList(ArrayList<Integer> list , int target){
//        bp = breaking point
        int bp = -1;
        int n = list.size();
        for (int i=0; i<list.size(); i++){
//       find breaking point
            if (list.get(i) > list.get(i+1)) { //15 > 6
                bp = i;
                break;
            }
        }
        int LP = bp + 1; //Left Pointer = 6 (smallest)
        int RP = bp; // Right Pointer = 15 (largest)

        while (LP != RP){
//            case : 1
            if (list.get(LP) + list.get(RP) == target){
                return true;
            }
//            case : 2
            if (list.get(LP) + list.get(RP) < target){
//                left point update
                LP = (LP + 1) % n;
            }else{
//                case : 3
//                right point update
                RP = (n+RP - 1)%n;
            }
        }
        return false;
    }
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);//0
        list.add(15);//1
        list.add(6);//2
        list.add(8);//3
        list.add(9);//4
        list.add(10);//5

        int target = 9;
        System.out.println(sortedRotatedArrList(list,target));
    }
}
