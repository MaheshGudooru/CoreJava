package streams.terminaloperations;

import java.util.Arrays;
import java.util.function.Predicate;

public class MatchOperations {

    public static void main(String[] args) {

        System.out.println (Arrays.asList ("hghfkjghd", "sfiosdjfksd", "tyrtrotoejryt", "xcvxbcbcvnnjcvmn")
                .stream ()
                .allMatch (
                        new Predicate<String> () {
                            @Override
                            public boolean test(String s) {
                                return s.contains ("j");
                            }
                        }
                ) ? "all elements have \"j\"" : "not all elements \"j\"");

        System.out.println (Arrays.asList ("hghfkjghd", "sfiosdjfksd", "tyrtrotoejryt", "xcvxbcbcvnnjcvmn")
                .stream ()
                .anyMatch (
                        new Predicate<String> () {
                            @Override
                            public boolean test(String s) {
                                return s.contains ("j");
                            }
                        }
                ) ? "at least one element have \"j\"" : "no element have \"j\"");

        System.out.println (Arrays.asList ("hghfkjghd", "sfiosdjfksd", "tyrtrotoejryt", "xcvxbcbcvnnjcvmn")
                .stream ()
                .noneMatch (
                        new Predicate<String> () {
                            @Override
                            public boolean test(String s) {
                                return s.contains ("j");
                            }
                        }
                ) ? "no element have \"j\"" : "some element have \"j\"");


    }
}
