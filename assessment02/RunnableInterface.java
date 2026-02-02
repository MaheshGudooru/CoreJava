public class RunnableInterface implements Runnable {

    // Runnable interface is recommended over Thread class when your class is already extending another class since Java does not support multiple inheritance

    @Override
    public void run() {
        System.out.println ("Thread execution has started....");
        try {
            Thread.sleep (1000);
        } catch (InterruptedException e) {
            System.err.println (e);
        }
        System.out.println (Thread.currentThread ().getName () + " is running...");
    }

    public static void main(String[] args) {


        Thread thread01 = new Thread (new RunnableInterface ());
        thread01.start ();
        try {
            thread01.join ();

        } catch (InterruptedException e) {
            System.err.println (e);
        }

        System.out.println ("Thread completed execution!");
    }

//    output:
//    Thread execution has started....
//    Thread-0 is running...
//    Thread completed execution!
}
