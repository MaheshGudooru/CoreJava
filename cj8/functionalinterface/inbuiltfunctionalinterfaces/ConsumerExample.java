package functionalinterface.inbuiltfunctionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String> () {   // takes input(consume) returns nothing
            // has only one abstract method void accept() used for performing operations on input
            @Override
            public void accept(String s) {
                System.out.println (s);
            }
        };

        Consumer<String> consumer1 = (s) -> System.out.println (s);

        consumer.accept ("this is a String..");
        consumer1.accept ("this is a String..");
    }
}
