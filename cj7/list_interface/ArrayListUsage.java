package list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


// Collection is the root interface represents a group of objects
// this interface extends(since both are interfaces) another interface called Iterable
// the Collection interface provide abstract methods like add, remove, size, iterator, contains etc...
// List, Set, Queue/Deque

// list are ordered collection(preserves insertion order), allows duplicate elements and the elements are accessed by their index

class Watch {
    String watchName;
    double watchCost;

    Watch(){

    }

    Watch(String watchName, double watchCost) {
        this.watchName = watchName;
        this.watchCost = watchCost;
    }

    public void printDetails() {
        System.out.println ("Name: " + this.watchName + " " + "Cost: " + this.watchCost);
    }
}

public class ArrayListUsage {

    public static void main(String[] args) {
        List<Watch> list = new ArrayList<> ();
//        CopyOnWriteArrayList<Watch> list = new CopyOnWriteArrayList<> (); // for thread safety

        // ArrayList implements List interface
        // ArrayLists are not suited for frequent insert and remove operations since they traverse through the entire list of objects in the worst case(O(n))
        // internally uses resizable array
        // not synchronized so not thread safe
        // uses contiguous memory
        Watch casio = new Watch ("Casio", 1999.99);
        Watch taiwan = new Watch ("Taiwan", 999.99);
        Watch seiko = new Watch ("Seiko", 29000.00);
        Watch omega = new Watch ("Omega", 10000000.00);

        list.add (casio); // adds the object to the list
        list.add (taiwan);
        list.add (seiko);
        list.add (omega);

        list.addFirst (seiko); // add the object to the 0th index of the list i.e., first element in the list

        list.addLast (casio); // add the object to the last index of the list i.e., list.size() - 1

        list.set (2, omega); // overrides the object at the specified index with the new specified object

        list.remove (omega); // removes first occurrence of the object from the list

        list.remove (casio); // removes all occurrences of the object from the list

//        list.clear(); // clears the entire list content

        list.size (); // returns the size of the list

        list.isEmpty (); // returns true if the list does not have any elements and false otherwise

        list.contains (seiko); // returns true if the element exists in the list otherwise false


        list.indexOf (casio); // return the index of the first occurrence of the specified object

        list.lastIndexOf (casio); // return the last occurrence of the specified object in the list

        for (Watch watch : list) { // for-each loop to iterate through the list
            watch.printDetails ();
        }

        System.out.println ();

        Watch[] watches = list.toArray (new Watch[0]); // convert list to an array

        for (Watch watch : watches) {
            watch.printDetails ();
        }

        Iterator<Watch> it = list.iterator (); // generally used for conditionally removing elements from the list while iterating
        while (it.hasNext ()) {
            it.next ().printDetails ();
        }





    }
}
