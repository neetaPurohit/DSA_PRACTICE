package Deque;

import java.util.Deque;
import java.util.LinkedList;

// implement stack using deque
public class StackUsingDeque {
  static class Stack{
      static Deque<Integer> deque = new LinkedList<>();

//      push
      public void push(int data){
          deque.addLast(data);
      }

//      pop
      public int pop(){
         return deque.removeLast();
      }

//      peek
      public int peek(){
          return deque.getLast();
      }

  }
    static void main(String[] args) {
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}
