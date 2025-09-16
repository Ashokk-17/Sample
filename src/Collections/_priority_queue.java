package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class _priority_queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(11);
        pq.add(2);
        pq.add(13);
        pq.add(4);
        pq.add(50);
        pq.add(1);
        pq.add(0);
        pq.add(99);
        System.out.println("The total elements added in priority queue is\n="+pq);
        System.out.println("The peeked element is "+pq.peek());
        System.out.println(pq);
        System.out.println("After polling a last element "+pq.poll());
        System.out.println(pq);
        System.out.println("After polling a last element "+pq.poll());
        System.out.println(pq);
        System.out.println("After polling a last element "+pq.poll());
        System.out.println(pq);
    }
}
