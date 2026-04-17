package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


        public static boolean isEmpty(){
            return s1.isEmpty();
        }

//        add  T.c = O(n)
        public static void add(int data){
//            step = 1 pop s1's ele until s1 is not empty
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
//            step = 2 push in s1
            s1.push(data);

//            step = 3
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
//        remove T.c = O(1)
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

//        peek  T.c = O(1)
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
