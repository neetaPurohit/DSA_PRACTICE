package Patterns;

public class Inverted_Half_Number_Pyramid {
    public static void inverted_half_number_pyramid(int totalRow){
     for (int i=1; i<=totalRow; i++){
        for (int j=1;  j<=totalRow-i+1; j++){
            System.out.print(j);
        }
         System.out.println();
    }
}
    static void main(String[] args) {
        inverted_half_number_pyramid(5);
    }
}
