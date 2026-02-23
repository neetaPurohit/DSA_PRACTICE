package DivideConquer;

public class QuickSort {
    public static void quickSort(int[] arr,int si, int ei){
        if (si>=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);//left part
        quickSort(arr,pIdx,ei);//right part
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for (int j=si; j<ei; j++){
            if (arr[j] <= pivot){
                i++;
//                swapping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {3,6,1,4,6,2,9,8};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
