class Cnt {
    int cnt = 0;

    public synchronized void getCnt() {
        System.out.println (cnt); // only one thread can access this method at any given time
    }

    public synchronized void setCnt() {
        this.cnt++; // only one thread can access this method at any given time
    }
}


public class ThreadSynchronization extends Thread {

    Cnt cnt;

    ThreadSynchronization(Cnt cnt){
        this.cnt = cnt;
    }

    @Override
    public void run() {
        m1 ();
    }

    public void m1() {
        System.out.println (Thread.currentThread ().getName () + " is running..");
        this.cnt.setCnt ();
        this.cnt.getCnt ();

    }

    public static void main(String[] args) {

        Cnt cnt = new Cnt (); // shared resource

        ThreadSynchronization t01 = new ThreadSynchronization (cnt);
        t01.setName ("thread-01");

        ThreadSynchronization t02 = new ThreadSynchronization (cnt);
        t02.setName ("thread-02");

        ThreadSynchronization t03 = new ThreadSynchronization (cnt);
        t03.setName ("thread-03");

        t01.start ();
        t02.start ();
        t03.start ();

//        output:
//        thread-02 is running..
//        1
//        thread-01 is running..
//        2
//        thread-03 is running..
//        3

        // the thread execution sequence may vary but only after the first thread incremented the cnt the next thread can access it

    }

}
