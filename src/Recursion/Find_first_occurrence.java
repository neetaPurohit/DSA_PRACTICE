package Recursion;

public class Find_first_occurrence {
public static int firstOccurrence(int[] arr, int key , int i){
//    base case
    if(i == arr.length){
        return -1;
    }
    if (arr[i]==key){
        return i;
    }
   return firstOccurrence(arr,key,i+1);
}
    static void main(String[] args) {
       int[] arr = { 5,6,4,7,9,4};
        System.out.println(firstOccurrence(arr,4,0));
    }
}
