package streams.terminaloperations.collectoperation;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class CollectorsSummarizeOperation {

    public static void main(String[] args) {

        IntSummaryStatistics stats = Arrays.asList (3,5,6,9,9,7,9)
                .stream ()
                .collect (
                        Collectors.summarizingInt (
                                new ToIntFunction<Integer> () {
                                    @Override
                                    public int applyAsInt(Integer value) {
                                        return (int) value;
                                    }
                                }
                        )
                );

        System.out.println (stats.getMax ());
        System.out.println (stats.getMin ());
        System.out.println (stats.getAverage ());
        System.out.println (stats.getSum ());

    }
}
