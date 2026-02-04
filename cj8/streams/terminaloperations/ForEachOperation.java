package streams.terminaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// once a terminal operation runs the stream is consumed cannot be reused
// streams are lazy so only a terminal operation can trigger the execution of a stream

public class ForEachOperation {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList (5,54,758,679,70,3,452,43,57,58,796,780,7,0,8,47,4,5,124,34,654,7,59,870);
//
//        Stream<Integer> stream = list.stream ();
//
//        stream.forEach (new Consumer<Integer> () { // performs an operation on each element of the stream, does not return a stream since it is a terminal operation
        //
//            @Override
//            public void accept(Integer i) {
//                System.out.print (i + " ");
//            }
//        });

        Arrays.asList (5,54,758,679,70,3,452,43,57,58,796,780,7,0,8,47,4,5,124,34,654,7,59,870)
                .stream ()
                .map (n -> n + " ")
                .forEach (System.out::print);
    }
}
