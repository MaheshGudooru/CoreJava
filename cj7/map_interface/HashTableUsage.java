package map_interface;

import java.util.Hashtable;

public class HashTableUsage {

    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<> (2);
        // HashMap are inherently thread safe
        // similar to HashMap where key is converted to hashcode
        // does not allow null values

        map.put ("CPM", 45);
        map.put ("TDP", 45);
        map.put ("BRS", 45);
        map.put ("CNG", 45);


    }
}
