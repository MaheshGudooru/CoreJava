package streams.terminaloperations.collectoperation;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

// groupingBy can have
// 1. classifier - the function that extracts key for the grouping
// 2. downstreamer - Collector that decides how values inside groups are accumulated or stored
// 3. mapsupplier - creates the collection that holds the elements

public class CollectorsGroupingByOperation {

    public static void main(String[] args) {

        Map<String, List<String>> map = Arrays.asList ("intern mahesh", "intern manoj", "intern shivaram", "dev prashanth", "dev preetam")
                .stream ()
                .collect (
                        Collectors.groupingBy (
//                                new Function<String, String> () {
//                                    @Override
//                                    public String apply(String s) {
//                                        return s.split (" ")[0];
//                                    }
//                                }
                                s -> s.split (" ")[0] // classifier
                        )
                );

        Map<String, Long> map1 = Arrays.asList ("intern mahesh", "intern manoj", "intern shivaram", "dev prashanth", "dev preetam")
                .stream ()
                .collect (
                        Collectors.groupingBy (
                                s -> s.split (" ")[0], // classifier
                                Collectors.counting () // downstream
                        )
                );

        Map<String, Set<String>> map2 = Arrays.asList ("intern mahesh", "intern manoj", "intern shivaram", "dev prashanth", "dev preetam")
                .stream ()
                .collect (
                        Collectors.groupingBy (
                                s -> s.split (" ")[0], // classifier
                                HashMap::new,
                                Collectors.toSet ()

                        )
                );

        map.forEach (new BiConsumer<String, List<String>> () {
            @Override
            public void accept(String s, List<String> strings) {
                System.out.print (s + ": ");
                strings.stream ().forEach (new Consumer<String> () {
                    @Override
                    public void accept(String s) {
                        System.out.print (s + ", ");
                    }
                });
                System.out.println ();
            }
        });

        map1.forEach (
                new BiConsumer<String, Long> () {
                    @Override
                    public void accept(String s, Long aLong) {
                        System.out.println (s + " = " + aLong);

                    }
                }
        );


    }
}
