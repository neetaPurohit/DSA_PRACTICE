package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeJCF {
    static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.addFirst(4);

        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);

        System.out.println("fist el: " + d.getFirst());
        System.out.println("last el: " + d.getLast());
    }
}
