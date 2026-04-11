package Stack;

public class StackUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

//        1. push
          public static void push(int data){
            Node newNode = new Node(data);

            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
          }

//          2. pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

//        3. peek
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    static void main(String[] args) {
       Stack s1 = new Stack();
       s1.push(1);
       s1.push(2);
       s1.push(3);
       s1.push(4);


       while (!s1.isEmpty()){
           System.out.println(s1.peek());
           s1.pop();

       }
    }
}
