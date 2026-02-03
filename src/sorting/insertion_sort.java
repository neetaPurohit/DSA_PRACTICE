package sorting;

public class insertion_sort {

    public static void insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int curr = arr[i];  //stored value
            int prev = i-1;  //current's previous element
//          finding out the correct position to insert
            //prev should be greater than 0 and if arr[prev] is greater than current element than do this....
            while (prev >= 0 && arr[prev] >curr){
                arr[prev+1] = arr[prev];  //push arr[prev] to the next idx if arr[prev] greater //shift
                prev--;
            }
//            insertion
          arr[prev+1] =  curr;//insert
        }
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void main(String[] args) {
        int[] arr = { 5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
