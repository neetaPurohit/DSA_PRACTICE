package Recursion;

public class Find_last_occurrence {
    public static int lastOccurrence(int arr[], int key, int i){
//      BASE CASE
        if (i == arr.length){
            return -1;
        }
//        look forward then compare with self
        int isFound = lastOccurrence(arr,key , i+1);
        if ((isFound == -1 && arr[i] == key)){
            return i;
        }
        return isFound;
    }
    static void main(String[] args) {
       int[] arr= {3,4,5,1,5};
        System.out.println(lastOccurrence(arr,5,0));
    }
}
