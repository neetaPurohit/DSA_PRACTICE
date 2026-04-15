package Stack;

import java.util.Stack;

public class DuplicatePair {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

//        t.c = O(n)
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
//            1. closing
            if (ch == ')'){
                int count = 0;
                while (s.peek() != '('){
                    s.pop();
                    count++;
                }
                if (count<1){
                    return true;  //duplicate exist
                }else {
                    s.pop();      //opening pair
                }
            }else {
//                opening condition
                s.push(ch);
            }
//
        }
        return false;
    }
    static void main(String[] args) {
//   valid string
        String str = "((a+b))";
        String str2 = "(a-b)";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
