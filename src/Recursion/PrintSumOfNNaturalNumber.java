package Recursion;

public class PrintSumOfNNaturalNumber {
    public static int sumOfN(int n){
//        base case
        if (n==1){
            return 1;
        }
        int Snm1  = sumOfN(n-1);
        int sn = n + Snm1;
        return sn;
    }
    static void main(String[] args) {

        System.out.println(sumOfN(5));
    }
}
