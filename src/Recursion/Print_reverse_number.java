package Recursion;

public class Print_reverse_number {
public static void printDec(int n){
//    base case
    if (n==1){
        System.out.println(n);
        return;
    }
    System.out.println(n);
    printDec(n-1);
}
    static void main(String[] args) {
    printDec(20);
    }
}
