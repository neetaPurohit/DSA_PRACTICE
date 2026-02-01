package ARRAYS;

public class prefixArray {
    public static void prefixSum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
//        defining new prefix array
        int[] prefix = new int [arr.length];
//        store sum of 0 index
        prefix[0] = arr[0];

//        calculate prefix sum
        for (int i=1; i<prefix.length; i++){
          prefix[i] = prefix[i-1] + arr[i];
        }

//        find start of array
        for (int i=0; i<arr.length; i++){
            int start = i;

            for (int j=i; j<arr.length; j++){
                int end = j;
//                if start's values is 0 then make prefix sum = 0 otherwise : calculate sum
                currSum = start==0 ? prefix[end]: prefix[end] - prefix[start-1];

                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is: "+ maxSum);
    }
    static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        prefixSum(numbers);
    }
}
//TC = big O(n^2)