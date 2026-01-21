
import java.util.Arrays;

public class DataTypes {

    public static void main() {

        System.out.println("Primitives");
        System.out.println();
        byte byteVar = 127; // byte a = 128 (This gives a compilation error since byte range is -128 t0 127 so new "a" is treated as an "int")
        System.out.println("Byte value is " + byteVar);
        System.out.println("A byte ranges from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Byte => " + Byte.SIZE + " bits");
        System.out.println();

        short shortVar = 4565;
        System.out.println("Short value is " + shortVar);
        System.out.println("A byte ranges from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Short => " + Short.SIZE + " bits");
        System.out.println();

        char charVar = 4565;
        System.out.println("Char value is " + charVar);
        System.out.println("A char cannot have a max value since we use ASCII values to store letters a(97)");
        System.out.println("Char => " + Character.SIZE + " bits");
        System.out.println();

        int intVar = 4565;
        System.out.println("Int value is " + intVar);
        System.out.println("An int ranges from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Int => " + Integer.SIZE + " bits");
        System.out.println();

        float floatVar = 4565;
        System.out.println("float value is " + floatVar);
        System.out.println("A float ranges from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Float => " + Float.SIZE + " bits");
        System.out.println();

        double doubleVar = 4565;
        System.out.println("Double value is " + doubleVar);
        System.out.println("A double ranges from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Double => " + Double.SIZE + " bits");
        System.out.println();

        long longVar = 4565;
        System.out.println("long value is " + longVar);
        System.out.println("A long ranges from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Long => " + Long.SIZE + " bits");

        System.out.print("\n\n");
        System.out.println("Primitives");
        System.out.println();

        Object arr = new int[2];
        System.out.println("arr is an array => " + (arr instanceof int[]));

        Object str = "mahesh";
        System.out.println("str is a string => " + (str instanceof String)); // is str an instance of String class

    }
}