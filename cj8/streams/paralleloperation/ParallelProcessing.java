package streams.paralleloperation;

import java.util.Arrays;

// parallel operation splits the stream into chunks and perform concurrent operations (common forkjoin pool)
// should not be used with mutable shared resources since there is chance of data inconsistency(due to race condition)

public class ParallelProcessing {

    public static void main(String[] args) {

        Arrays.asList (
                237, 482, 15, 901, 378, 642, 74, 519, 310, 826,
                93, 471, 584, 729, 68, 812, 256, 334, 907, 120,
                455, 688, 211, 349, 793, 144, 565, 38, 997, 621,
                104, 273, 487, 832, 39, 914, 276, 561, 48, 799,
                143, 682, 255, 97, 514, 307, 890, 429, 76, 613,
                190, 871, 366, 24, 745, 501, 328, 972, 65, 438,
                223, 844, 159, 571, 390, 618, 132, 799, 412, 957,
                88, 534, 211, 689, 374, 905, 26, 647, 319, 780,
                133, 468, 251, 992, 57, 811, 326, 593, 140, 872,
                309, 677, 24, 459, 786, 112, 540, 303, 825, 198
        )
                .stream ()
                .parallel () // only use parallel for stateless operation whose result does not depend on the result of previous elements
                .forEach (
                        i -> System.out.print (i + " ")
                );

    }

}
