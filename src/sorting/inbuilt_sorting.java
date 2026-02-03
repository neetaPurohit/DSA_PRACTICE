package sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inbuilt_sorting {

//    print array elements
    public static void printArr(Integer[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void main(String[] args) {
        Integer[] arr = { 3,5,2,4,1,9};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println();
//        Arrays.sort(arr,0,3);  //ending index is exclusive
//        printArr(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
