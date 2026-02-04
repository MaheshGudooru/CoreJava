package streams.terminaloperations.collectoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// collect is used to convert a stream into a mutable collection or object

// collectors define how elements are accumulated and combined
// collectors have 3 important operations
// 1. supplier - creates a new empty container for storing the accumulated elements
// 2. accumulator - defines how a stream element is added to the container, runs only once for each element
// 3. combiner - combines partial result in case of parallel streams (like combining two lists)
// 4. finisher - converts the container to final result (like list to an array)

public class CollectOperation {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList (5,54,758,679,70,3,452,43,57,58,796,780,7,0,8,47,4,5,124,34,654,7,59,870)
                .stream ()
                .parallel ()
                .collect(
                        ArrayList::new, // supplier (creates a new ArrayList)
                        List::add, // accumulator (adds the elements to the new ArrayList)
                        List::addAll // combiner (combines the part of the ArrayList into a single collection)

                );

        list.stream ().map(n -> n + " ").forEach (System.out::print);

    }
}
