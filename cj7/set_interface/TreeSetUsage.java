package set_interface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetUsage {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<> ();
        // TreeSet implements NavigableSet which internally implements SortedSet
        // SortedSet extends Set
        // TreeSet internally uses red-black tree
        // TreeSet maintains sorted order(natural order) of the elements

        set.add (56);
        set.add (989);
        set.add (23);
        set.add (9);
        set.add (674);
        set.add (123);
        set.add (123);

        Iterator<Integer> i = set.iterator ();

        while(i.hasNext ()) {
            System.out.print (i.next () + " ");
        }

    }
}
