package streams.terminaloperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MinMaxOperations {

    public static void main(String[] args) {
        Optional<Integer> maxVal = Arrays.asList (5, 54, 758, 679, 70, 3, 452, 43, 57, 58, 796, 780, 7, 8, 47, 4, 5, 124, 34, 654, 7, 59, 870)
                .stream ()
                .max (new Comparator<Integer> () {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });
        System.out.println (maxVal);

        Optional<Integer> minVal = Arrays.asList (5, 54, 758, 679, 70, 3, 452, 43, 57, 58, 796, 780, 7, 8, 47, 4, 5, 124, 34, 654, 7, 59, 870)
                .stream ()
                .max (new Comparator<Integer> () {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                });
        System.out.println (minVal);

    }

}
