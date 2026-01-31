package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapUsage {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<> ();
        // LinkedHashMap extends HashMap
        // maintains the insertion order
        // internally uses HashMap and doubly linkedlist to maintain the order

        map.put ("abc", 1);
        map.put ("def", 5);
        map.put ("ghi", 8);
        map.put ("jkl", 3);


        for (Map.Entry<String, Integer> e : map.entrySet ()) {

            System.out.println (e.getKey () + " " + e.getValue ());


        }

    }
}
