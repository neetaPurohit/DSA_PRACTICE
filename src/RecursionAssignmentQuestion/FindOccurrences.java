package RecursionAssignmentQuestion;

public class FindOccurrences {
    public static void printIndex(int[] arr,int i,int key){
//        base case
        if(i==arr.length){
           return;
        }

//       work
        if (arr[i] == key){
            System.out.println(i + " ");
        }
//        recursive call
        printIndex(arr,i+1,key);
    }
    static void main(String[] args) {
    int[] arr = {2,4,51,2,4,53,21,2,8,2,98,22,22,2,43,54,2};
    printIndex(arr,0,2);
    }
}
