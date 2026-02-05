package Two_D_Arrays;

import java.util.Scanner;

public class exe {
//    function to find a key from an array
     public static boolean searchKey(int[][] arr, int key){
         for (int i=0; i<arr.length; i++){
             for (int j=0; j<arr.length; j++){
                 if (arr[i][j] == key){
                     System.out.println("key found at index: ( " + i + "," + j + " )");
                     return true;
                 }
             }
         }

         System.out.println("Key not found:)");
         return false;
     }
     static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[][] arr = new int[3][3];
         int n=3,m=3; //n=rows, m=columns

//input elements
         for (int i=0; i<arr.length; i++){
             for (int j=0; j<arr.length; j++){
                 arr[i][j] = sc.nextInt();
             }
         }
// print elements
         for (int i=0; i<arr.length; i++){
             for (int j=0; j<arr.length; j++){
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
//     for key
         int key = sc.nextInt();
         System.out.println(searchKey(arr,key));
    }
}
