package Strings;

public class PrintLargestString {
    public static String printLargest(String[] fruits){
        String largest = fruits[0];
        for (int i=0; i<fruits.length; i++){
            if (largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
    static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        System.out.println(printLargest(fruits));
    }
}
