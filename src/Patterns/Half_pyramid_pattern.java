package Patterns;

public class Half_pyramid_pattern {
    static void main(String[] args) {
        int n=4;
        for (int i=1; i<=4; i++){
            for (int number=1; number<=i; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
