package racecondition;

class ThreadNameStr{
    String threadName;

    ThreadNameStr(String s) {
        threadName = s;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

}

public class RaceCondition extends Thread {


    ThreadNameStr str;

    RaceCondition(ThreadNameStr s) {
        str = s;
    }

    @Override
    public void run() {
        str.setThreadName ("current ThreadNamestr: " + Thread.currentThread ().getName ());
        System.out.println (str.getThreadName ());
    }

    public static void main(String[] args) {

        ThreadNameStr obj = new ThreadNameStr ("noname");

        RaceCondition t01 = new RaceCondition (obj);
        RaceCondition t02 = new RaceCondition (obj);
        RaceCondition t03 = new RaceCondition (obj);

        t01.start ();
        t02.start ();
        t03.start ();



    }

//    output:
//    current ThreadNamestr: Thread-0
//    current ThreadNamestr: Thread-1
//    current ThreadNamestr: Thread-2


    // in race condition all thread access a shared resource simultaneously and perform operation on it but the final value of the resource is determined by the order of execution of the threads which is always random
    // to avoid this situation we can either make the methods(operations) synchronized or if the data is an attribute of the class then making it volatile can help
}
