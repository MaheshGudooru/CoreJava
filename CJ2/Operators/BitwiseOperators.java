public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 13;
        int b = 29;

        System.out.println("Before operations: ");
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));

        System.out.println("a & b = " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("a >> b = " + Integer.toBinaryString(b >> 1));
        System.out.println("a << b = " + Integer.toBinaryString(b << 1));
        System.out.println("a >>> b = " + Integer.toBinaryString(a >>> b));
    }
}
