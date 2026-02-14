package Patterns;

public class hollowRectangle {
    public static void printHollowRectangle(int totRows, int totCols){
        for (int i=1; i<=totRows; i++){
            for (int j=1; j<=totCols; j++){
//                boundary condition
                if (i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        printHollowRectangle(4,4);
    }
}
