package Recursion;

public class Factorial {
public static int findFactorial(int n){
//    base case
    if (n==0){
        return 1;
    }
    int fnm1 = findFactorial(n-1);
    int fn = n * findFactorial(n-1);
    return fn;

}
    static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
