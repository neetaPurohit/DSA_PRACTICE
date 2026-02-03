package sorting;

public class bubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int swap =0;
            for (int j = 0; j <= arr.length - 2 - i; j++) {
//                swapping
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
                System.out.println("total swap" + swap);
                if (swap == 0){
                    break;
                }
            }
        }
    }
//    printing array
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
    }
}
