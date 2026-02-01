package ARRAYS;
//find max subarray sum using brute force
public class MaxSubArray {
    public static void printSubArraySum(int[] numbers){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;


//  for printing sub array sum
//        for starting

        for (int i=0; i<numbers.length; i++){
            int start = i;

//        for ending
            for (int j=i; j<numbers.length; j++){
                int end = j;

                currSum=0;
//  for sub array sum
                for (int k=start; k<=end; k++){
//                    sub array sum
                    currSum +=numbers[k];
                }
//  find max sum
                System.out.println("all current sum is: "+ currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }


            }
        }
        System.out.println("max sum" +
                " is: " + maxSum);
    }
    static void main(String[] args) {
      int numbers[] = {1,-2,6,-1,3};
        printSubArraySum(numbers);
    }
}
//Worst time complexity is
//TC = big O(n^3)