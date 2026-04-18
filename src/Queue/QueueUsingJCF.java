package Queue;
import java.util.*;

public class QueueUsingJCF {
    static void main(String[] args) {
//        Queue is an interface in java collection framework so we cannot make an object of an Interface

//      Queue<Integer> q = new LinkedList<>(); //Using LinkedList class
        Queue<Integer> q =  new ArrayDeque<>(); //Using ArrayDeque class
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(4);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
    