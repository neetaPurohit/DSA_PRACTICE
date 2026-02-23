package DivideConquer;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei) {
//        base case
        if (si >= ei) {
            return;
        }

//        work
        int mid = si + (ei - si) / 2;

//        recursive call
        mergeSort(arr, si, mid);//for left part
        mergeSort(arr, mid + 1, ei);//for right part
        merge(arr,si,mid,ei);
    }

    //    merge
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;//iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temp array

//        adding elements in temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
//        for elements that are left
        while (i <= mid) {
            temp[k++] = arr[i++]; //add & increase idx
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
//        copy temp array to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


//    print array
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2, 6, 4, 5, 8, 10};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
