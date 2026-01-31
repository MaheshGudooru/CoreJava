package map_interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Map does not extend Collecion
// Map generally hold <key, value> pairs
// keys should be unique and each key can hold atmost one value

public class HashMapUsage {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<> ();
//        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<> (); // for thread safety
        // HashMap implements Map interface
        // stores key value pairs
        // HashMap is unordered
        // Internally uses an array of nodes where each index is treated as a bucket
        // each element is stored as a Node object
        // the key is first hashcoded and then stored


        map.put ("mahesh", 21); // adds the key value pair to the map, if the key already exists then returns the corresponding value of the key and changes it's value to new value
        map.put ("prashanth", 28);
        map.put ("preetam", 24);
        map.put ("manoj", 21);
        System.out.println (map.put("mahesh", 99));



        map.size (); // returns the number of entries in the map

        map.get("manoj"); // returns the corresponding values for the given key

        map.remove ("mahesh"); // removes the key-value pair and returns the value associated with that removed key

        map.containsKey ("rakesh"); // returns true if the map contains the given key else false

        map.containsValue (55); // checks if the value exists in the map. returns true if exists otherwise false

        map.keySet (); // return a set that contains all keys in the map

        System.out.println (map.values ()); // returns a list of all the values in the map

//        map.clear (); // clears the entire map

        map.putIfAbsent ("rakesh", 21); // inserts the key-value pair if the key doesnot exist

        map.getOrDefault ("suresh", 21); // returns the value of the key if specified and if the key is absent the default specified value is returned

        map.computeIfAbsent ("suresh", k -> new Integer (21)); // this(new Integer(int i) is deprecated since Java 9 but if the key doesnot exists then the give expression is executed

        for(Map.Entry<String, Integer> e : map.entrySet ()) {

            System.out.println (e.getKey () + " " + e.getValue ());

        }

    }
}
