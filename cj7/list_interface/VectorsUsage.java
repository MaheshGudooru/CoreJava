package list_interface;

import java.util.Enumeration;
import java.util.Vector;

public class VectorsUsage {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<> ();

        // vectors implements List interface
        // vectors were introduces in Java 1.0 and were a part of java.util package
        // vectors are similar to ArrayList but are thread safe by default
        // vectors are inherently synchronized(thread safe)
        // but every read and write operation was blocking other threads which resulted in major performance issues(method-level synchronization)


        // today we use ArrayList as an alternative for vectors
        // and use CopyOnWriteArrayList and Collections.synchronizedList(new ArrayList<>()) for thread safe collections


        vector.addElement ("ele01"); // legacy method to add element
        vector.addElement ("ele02");
        vector.addElement ("ele03");
        vector.addElement ("ele04");

        vector.elementAt (2); // to get an element at the specified index

        vector.setElementAt ("ele05", 3); // sets the given element at specified index

        vector.removeElement ("ele03"); // removes element from the vector

        vector.capacity (); // returns the size of the vector

        Enumeration<String> e = vector.elements ();

        while(e.hasMoreElements ()) { // returns true if the vectors has element left in it
            System.out.println (e.nextElement ()); // returns the current element and moves the pointer to next element
        }

    }
}
