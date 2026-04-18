package Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static Deque.StackUsingDeque.Stack.deque;

public class QueueUsingDeque {
   static class Queue{
       Deque<Integer> queue = new LinkedList<>();

//       add
       public void add(int data){
           deque.addLast(data); //add from rear(like queue)
       }

//       remove
       public int remove(){
           return deque.removeFirst();  //remove from first(like queue)
       }

//       peek
       public int peek(){
           return deque.getFirst(); //get from first(like queue)
       }
   }
    static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.peek());

    }
}
