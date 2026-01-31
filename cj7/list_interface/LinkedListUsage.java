package list_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListUsage {

    public static void main(String[] args) {

        List<String> list = new LinkedList<> ();

        // LinkedList implements both List and Deque interfaces
        // internally implements doubly-linkedlist
        // useful when operations like insertion or deletion happens at the beginning or the end of the list
        // uses nodes so non-contiguous
        // used while implementing queues/deques

        // since LinkedList implements the same List interface as the ArrayList most methods remain same but their efficiency might differ
        list.add ("mahesh");
        list.add ("nahesh");
        list.add ("oahesh");
        list.add ("pahesh");
        list.add ("qahesh");



        for(String name: list) {

            System.out.println (name);
        }


    }
}
