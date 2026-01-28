public class VariablesOperators {

    byte b;
    short s;
    char ch;
    int i;
    double d;
    float f;
    long l;
    boolean bool;



    public void arithematicOperation() {
        int x = 10;
        int y = 12;

        System.out.println("(addition)a + b = " + (x + y));
        System.out.println("(subtraction)a - b = " + (x - y));
        System.out.println("(multiplication)a * b = " + (x * y));
        System.out.println("(division)a / b = " + (x / y));
        System.out.println("(remainder)a % b = " + (x % y));
    }

    public void dataTypes() {

        System.out.println("byte default value = " + b);
        System.out.println("byte size = " + Byte.SIZE + " bits");

        System.out.println("short default value = " + b);
        System.out.println("short size = " + Short.SIZE + " bits");

        System.out.println("char default value = " + ch);
        System.out.println("char size = " + Character.SIZE);

        System.out.println("boolean default value = " + bool);

        System.out.println("int default value = " + b);
        System.out.println("int size = " + Integer.SIZE + " bits");

        System.out.println("float default value = " + b);
        System.out.println("float size = " + Float.SIZE + " bits");

        System.out.println("double default value = " + b);
        System.out.println("double size = " + Double.SIZE + " bits");

        System.out.println("long default value = " + b);
        System.out.println("long size = " + Long.SIZE + " bits");

    }

    static void main() {
        System.out.println("DATATYPES IN JAVA");
        new VariablesOperators().dataTypes();

        System.out.println();
        System.out.println("ARITHEMATIC OPERATIONS");
        new VariablesOperators().arithematicOperation();
    }
}
