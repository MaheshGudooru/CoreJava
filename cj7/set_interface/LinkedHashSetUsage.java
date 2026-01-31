package set_interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetUsage {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<> ();

        // LinkedHashSet extends HashSet
        // maintains the insertion order
        // internally uses hash table and doubly linkedlist

        set.add (34);
        set.add (3);
        set.add (67);
        set.add (23);
        set.add (98);
        set.add (57);

        Iterator<Integer> i = set.iterator ();

        while (i.hasNext ()) {
            System.out.print (i.next () + " ");
        }
    }
}
