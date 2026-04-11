package Stack;

import java.util.Stack;

public class StackUsingJCF {
    static void main(String[] args) {
//        stack using java collection framework
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
