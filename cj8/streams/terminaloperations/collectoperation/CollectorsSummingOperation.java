package streams.terminaloperations.collectoperation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CollectorsSummingOperation {

    public static void main(String[] args) {

        int sum = Arrays.asList (2,6,8,456,457,78,74,54,25,523,5)
                .stream ()
                .collect (
                        Collectors.summingInt (
//                                new ToIntFunction<Integer> () {
//                                    @Override
//                                    public int applyAsInt(Integer value) {
//                                        return (int) value;
//                                    }
//                                }

                                Integer::intValue
                        )
                );

        System.out.println (sum);

    }
}
