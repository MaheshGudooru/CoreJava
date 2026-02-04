package streams.terminaloperations.collectoperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMapOperation {

    public static void main(String[] args) {

        Map<Integer, Double> map = Arrays.stream (new int[]{4,6,8,9,0})
                .collect (
                        HashMap::new,
                        (containerMap, val) -> {
                            containerMap.put(val, Math.sqrt (val));
                        },
                        HashMap::putAll

                );



        Map<Integer, Double> map1 = (Map<Integer, Double>) Stream.of (

                Map.entry (4, Math.sqrt (4)),
                Map.entry (6, Math.sqrt (6)),
                Map.entry (8, Math.sqrt (8)),
                Map.entry (9, Math.sqrt (9)),
                Map.entry (0, Math.sqrt (0))
        ).collect (Collectors.toMap (
                Map.Entry::getKey,
                Map.Entry ::getValue,
                (a,b) -> b,
                HashMap::new
        ));


        map.forEach ((k, v) -> System.out.println (k + " " + v));
        System.out.println ();
        map1.forEach ((k, v) -> System.out.println (k + " " + v));


    }
}
