package Patterns;

public class Character_pattern {
    static void main(String[] args) {
        int n=4;
        char ch = 'A';
        for (int i=1; i<=4; i++){
            for (int chars=1; chars<=i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
