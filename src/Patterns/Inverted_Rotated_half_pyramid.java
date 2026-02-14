package Patterns;

public class Inverted_Rotated_half_pyramid {
    public static void printInvertedRotatedHalfPyramid(int totalRows){
        int n=totalRows;
        for (int i=1; i<=totalRows; i++){
            for (int space=1; space<=n-i; space++){
                System.out.print("   ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
       printInvertedRotatedHalfPyramid(4);
    }
}
