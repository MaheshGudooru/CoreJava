package exception.exception_handling;

public class MultipleCatch {

    public static void main(String[] args) {

        try {
            int x = 11111111 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        } catch (NullPointerException e) {
            System.err.println(e);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
    }
}
