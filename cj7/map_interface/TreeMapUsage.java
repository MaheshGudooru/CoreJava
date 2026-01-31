package map_interface;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapUsage {


    public static void main(String[] args) {

        Map<Integer, List<Integer>> map = new TreeMap<> ();

        // TreeMap implements NavigableMap which extends SortedMap
        // keys are stored in natural order and sometimes depends on the comparator
        // internally uses red-black tree
        // when a key is being inserted it is compared using compareTo() or Comparator.compare()
        // while retrieving the red-black tree is traversed
        // when key is removed the tree is balanced

        map.put(2, new ArrayList<> ());

        map.computeIfAbsent (3, k -> new ArrayList<> ());
        map.put (4, new ArrayList<> ());
        map.put (8, new ArrayList<> ());
        map.put (3, new ArrayList<> ());
        map.put (0, new ArrayList<> ());
        System.out.println(map.put (2, new ArrayList<> ()));
        map.put (76, new ArrayList<> ());
        map.get(2).add (4);



        for(Map.Entry<Integer, List<Integer>> e : map.entrySet ()) {

            System.out.println (e.getKey () + " " + e.getValue ());

        }


    }
}
