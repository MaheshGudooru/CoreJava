public class ExceptionPropagation {

    public void m0() throws Exception {
        throw new Exception ("My exception");
    }


    public void m1() throws Exception {

        m0();
    }

    public void m2() {
        try {
            m1 ();
        } catch (Exception e) {
            System.err.println (e);
        }
    }

    public void m3() {
        m2();
    }


    static void main(String[] args) {

        new ExceptionPropagation().m3 ();
    }

    // exception propagation implies that if one method call results in an exception then JVM looks at its caller method and any one of those caller method handles that exception then the JVM uses it.
}
