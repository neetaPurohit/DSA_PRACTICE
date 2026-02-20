package Recursion;

public class Pow_Calc { //x^n
    public static int pow(int x, int n){
//        base case
        if (n==0){
            return 1;
        }
        return x * pow(x,n-1); //this will run till base case hit then returns.
    }
    static void main(String[] args) {

    }
}
