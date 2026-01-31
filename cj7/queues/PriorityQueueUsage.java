package queues;

import java.util.PriorityQueue;

public class PriorityQueueUsage {
    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<> ();
        // by default a min-heap
        // internally implements a min-heap
        // elements are removed based on the priority not insertion order

        q.offer (2);
        q.offer (8);
        q.offer (1);
        q.offer (-3);

        while(!q.isEmpty ()) {
            System.out.println (q.poll ());
        }
    }
}
