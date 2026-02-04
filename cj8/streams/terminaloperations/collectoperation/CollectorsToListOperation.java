package streams.terminaloperations.collectoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToListOperation {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList (5,54,758,679,70,3,452,43,57,58,796,780,7,0,8,47,4,5,124,34,654,7,59,870)
                .stream ()
                .collect(Collectors.toList ()); // returns a List collection of stream elements

        list.stream ()
                .map(k -> k + " ")
                .forEach (System.out::print);


    }
}
