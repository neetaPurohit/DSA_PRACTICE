package Patterns;

public class TrianglePattern {
public static void trianglePattern(int n){
//    Floyd's triangle pattern
    int counter = 1;
//    outer loop
    for (int i=1; i<=n; i++){
//        inner loop for printing
        for (int j=1; j<=i; j++){
//            printing
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
    static void main(String[] args) {
       trianglePattern(5);
    }
}
