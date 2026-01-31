package set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// sets does not allow duplicate elements
// order of the elements depends on the implementation
// hashset does not maintain insertion order where as LinkedHashSet does
// TreeSet maintains sorted order

public class HashSetUsage {

    static void main(String[] args) {
        Set<Integer> set = new HashSet<> ();
        // HashSet implements Set interface
        // HashSet uses hashCode() first then use equals() hence the name hashset
        // HashSets are best for finding out if an element exists (constant time) and also for adding and removing elements

        set.add (3); // adds an element if not present. returns true if the element is added otherwise false i.e., element already exists
        set.add (9);
        set.add (5);
        set.add (3);

        set.remove (5);// removes the given element

//        set.clear (); // empties the set completely

        set.contains (5); // returns true if the element exists otherwise false

        set.isEmpty (); // checks whether the set is empty

        set.size (); // returns the size of the set

        for(Integer i : set) {

            System.out.println (i);
        }

        System.out.println ();

        System.out.println ();

        Iterator<Integer> i = set.iterator ();
        while(i.hasNext ()) {
            System.out.println (i.next ());
        }
    }
}
