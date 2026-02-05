package Strings;

public class printLetters {
    public static void printLetter(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
    static void main(String[] args) {
        String str = "nikitaPurohit";
        printLetter(str);
    }
}
