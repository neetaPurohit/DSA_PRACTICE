package LinkedList;

public class BasicOfLinkedList {

    public static class Node{
           int Data;
           Node next;

//           constructor
        public Node(int data){
            this.Data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;

//     methods:
//     1.ADD FIRST 2.ADD LAST 3.PRINT VALUE

    public void addFirst(int data){
//        if linked list is empty then, first create new node

//      step: 1 create new node
        Node newNode = new Node(data);

        if (head==null){
             head=tail = newNode;
             return;
        }


//       step: 2 newNode next = head
        newNode.next = head;  //linking step

//       step: 3 head = newNode
        head = newNode;
    }

    public void addLast(int data){
//        step:1 create new node
        Node newNode = new Node(data);
//        special case (linkedList is empty)
        if(head == null){
            head = tail = newNode; //now both have new node's value
            return;
        }
//        step:2 point tail to new node
        tail.next= newNode;
//        step:3 make new node = tail
        tail = newNode;

    }

//    T.c = O(n)
    public void print(){
//        base case
        if (head == null){
            System.out.println("LL(Linked List) is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.Data+ "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


   public static void main(String[] args) {
         BasicOfLinkedList ll = new BasicOfLinkedList();
//         ll.head = new Node(1);
//         ll.head.next = new Node(2);

             ll.print();

//            add first  T.c = O(1)
            ll.addFirst(2);
       ll.print();
            ll.addFirst(1);
       ll.print();

//            add last   T.c = O(1)
            ll.addLast(3);
       ll.print();
            ll.addLast(4);
       ll.print();

    }
}
