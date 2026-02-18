package Recursion;

public class Print_Increasing_order {
    public static void increasing_num(int n){
//        base case
        if (n==1){
            System.out.println(n);
            return;
        }
        increasing_num(n-1);
        System.out.println(n);
    }
    static void main(String[] args) {
        increasing_num(10);
    }
}
