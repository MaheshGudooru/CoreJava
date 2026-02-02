public class ThreadClassState extends Thread {

    @Override
    public void run() {
        System.out.println (Thread.currentThread ().getName () + " is running..."); // the thread is in running state
    }

    public static void main(String[] args) {

        ThreadClassState thread01 = new ThreadClassState (); // thread is in new state
        System.out.println ("The thread is in " + thread01.getState () + " state");

        thread01.start (); // thread is in runnable state waiting for resource
        System.out.println ("The thread is in " + thread01.getState () + " state");


        try {
            thread01.join (); // the main thread waits until the thread01 completes its execution
        } catch (InterruptedException e) {
            System.err.println (e);
        }

        System.out.println ("The thread is in " + thread01.getState () + " state"); // the thread01 is in terminated state since completed its execution
    }

//    output:
//    The thread is in NEW state
//    The thread is in RUNNABLE state
//    Thread-0 is running...
//    The thread is in TERMINATED state
}
