package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Queue is an interface that extends Collection
// elements are inserted at the tail and removed from the head, follows FIFO principal

public class QueueUsage {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<> ();
//        BlockingQueue<Integer> q = new ArrayBlockingQueue<> (); // for thread safety

        q.add (3); // throws exception if the queue is full
        q.offer (3); // returns false if the queue is full

        q.isEmpty (); // returns true if queue is empty otherwise false

        q.remove (); // returns and removes the head of the queue, throws exception when the queue is empty
        q.poll (); // returns and removes the head of the queue, or null if queue is empty

        q.element (); // returns the head of the queue, throws exception when the queue is empty
        q.peek (); // returns the head of the queue, or null if the queue is empty

    }
}
