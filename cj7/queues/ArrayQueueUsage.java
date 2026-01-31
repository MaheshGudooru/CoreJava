package queues;

import java.util.ArrayDeque;
import java.util.Deque;

// Deque extends Queue interface
// can handle insertion and deletion from both head and tail

public class ArrayQueueUsage {

    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<> ();
        // ArrayDeque implements Deque interface
        // resizable
        // can behave like a deque(double ended queue) and stack
        // faster than LinkedList for Deque and Stack


        q.offer (4);
        q.push (5);
        q.poll ();
        q.pop ();
        q.pollFirst ();
        q.pollLast ();
        q.peek ();
        q.addFirst (7);
        q.offerFirst (7);
        q.addLast (9);
        q.offerLast (9);

    }
}
