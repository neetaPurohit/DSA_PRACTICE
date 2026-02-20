package Recursion;

public class Tiling_Problem {
//    floor size 2 x n (where 2 is height)
    public static int tilingProblem(int n){
//   base case
     if (n==0 || n==1){
         return 1;
     }
//     choices
//     vertical choice
        int fnm1 = tilingProblem(n-1);
//     horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    static void main(String[] args) {
        System.out.println(tilingProblem(3));
        System.out.println(tilingProblem(4));
    }
}
