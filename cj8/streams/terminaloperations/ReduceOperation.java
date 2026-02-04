package streams.terminaloperations;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceOperation {

    public static void main(String[] args) {

        System.out.println (Arrays.asList (5, 54, 758, 679, 70, 3, 452, 43, 57, 58, 796, 780, 7, 8, 47, 4, 5, 124, 34, 654, 7, 59, 870)
                .stream ()
                .reduce (
                        0,
//                        new BinaryOperator<Integer> () {
//                            @Override
//                            public Integer apply(Integer integer, Integer integer2) {
//                                return integer + integer2;
//                            }
//                        }
                        (a, b) -> a + b
                ));

    }
}
