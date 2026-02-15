package Patterns;

public class Zero_one_triangle_pattern {
    public static void zeroOneTriangle(int n){
//        outer loop
        for (int i=1; i<=n; i++){
//            inner loop
            for (int j=1; j<=i; j++){
//                condition
             if ((i+j)%2==0){
                 System.out.print("1");
             }else {
                 System.out.print("0");
             }
            }
                System.out.println();
        }
    }
    static void main(String[] args) {
        zeroOneTriangle(5);
    }
}
