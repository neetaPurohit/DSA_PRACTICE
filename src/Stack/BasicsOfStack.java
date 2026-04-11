package Stack;

import java.util.ArrayList;

public class BasicsOfStack {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();


        public static boolean isEmpty(){
            return list.size()==0;
        }

//        Stack operations
//        1.push operation
        public static void push(int data){
            list.add(data);
        }
//        2.pop operation
        public static int pop(){
//            corner case if stack is empty
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
//        3.peek operation
        public static int peek(){
//            corner case if stack is empty
            if (isEmpty()){
                return -1;
            }
//            peek top element
            return list.get(list.size()-1);
        }
    }
    static void main(String[] args) {
          Stack s = new Stack();
          s.push(1);
          s.push(2);
          s.push(3);


          while (!s.isEmpty()){ //till stack is empty
              System.out.println(s.peek()); //print element
              s.pop(); //delete element
          }

    }
}
