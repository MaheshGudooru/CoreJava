package list_interface;

import java.util.Stack;

public class StackUsage {

    static void main(String[] args) {

        Stack<String> stack = new Stack<> ();

        // Stack extends Vector and is thread safe just like vectors are and also slow , poorly designed

        stack.push ("abcd"); // add elements to the top of the stack
        stack.push ("efgh");
        stack.push ("ijkl");
        stack.push ("mnop");

        stack.pop(); // removes and returns the removed element from the top of the stack

        stack.isEmpty (); // returns true if stack is empty else false

        stack.peek(); // returns the top of the stack without removing it

        System.out.println (stack.search ("ijkl")); // returns the index of the matching element


    }
}
