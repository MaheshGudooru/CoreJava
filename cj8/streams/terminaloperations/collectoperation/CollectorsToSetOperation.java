package streams.terminaloperations.collectoperation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSetOperation {

    public static void main(String[] args) {


        Set<Integer> set = Arrays.stream (new int[]{4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35, 2, 4, 6, 8, 9, 5, 3, 12, 4, 6, 8, 5, 43, 45, 64, 5, 45, 7, 47, 4, 756, 8, 56, 8, 57, 8, 7, 9, 79, 35, 435, 23, 5, 4, 5, 6})
                .collect (
                        HashSet::new,
                        Set::add,
                        Set::addAll
                );

        Set<Integer> set1 = Arrays.stream (new int[]{4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35, 2, 4, 6, 8, 9, 5, 3, 12, 4, 6, 8, 5, 43, 45, 64, 5, 45, 7, 47, 4, 756, 8, 56, 8, 57, 8, 7, 9, 79, 35, 435, 23, 5, 4, 5, 6}).boxed () // since the stream is IntStream, boxing() converts them to Integers and returns another stream
                .collect (Collectors.toSet ());

        set.stream ().sorted ().map (n -> n + " ").forEach (System.out::print);
        System.out.println ();
        set1.stream ().sorted ().map (n -> n + " ").forEach (System.out::print);


    }
}
