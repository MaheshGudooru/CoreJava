public class AutoUnBoxing {

    // autoboxing is the automatic conversion of primitives into their corresponding wrapper classes
    // unboxing is the automatic conversion of wrapper class into their corresponding primitive types

    public static void main(String[] args) {

        Integer i = 8787685;
        int j = i; // unboxing
        System.out.println (j);

        int k = 7476347;
        Integer l = k; // autoboxing

        System.out.println (l);

    }
}
