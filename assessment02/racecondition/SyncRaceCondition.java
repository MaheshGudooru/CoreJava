package racecondition;

class SynThreadNameStr {
    String  syncthreadName;

    SynThreadNameStr(String s) {
        syncthreadName = s;
    }

    public synchronized String getThreadNameSynchronized() {
        return syncthreadName;
    }

    public synchronized void setThreadNameSynchronized(String syncthreadName) {
        this.syncthreadName = syncthreadName;
    }
}

public class SyncRaceCondition extends Thread {

    SynThreadNameStr str;

    SyncRaceCondition(SynThreadNameStr s) {
        str = s;
    }

    @Override
    public void run() {
        str.setThreadNameSynchronized (Thread.currentThread ().getName ());
        System.out.println (str.getThreadNameSynchronized ());
    }

    public static void main(String[] args) {
        SynThreadNameStr obj01 = new SynThreadNameStr ("noname");

        SyncRaceCondition t1 = new SyncRaceCondition (obj01);
        SyncRaceCondition t2 = new SyncRaceCondition (obj01);
        SyncRaceCondition t3 = new SyncRaceCondition (obj01);

        t1.start ();
        t2.start ();
        t3.start ();

        try {
            t1.join ();
            t2.join ();
            t3.join ();
        } catch (InterruptedException e) {
            System.err.println (e);
        }

        System.out.println ("final name: " + obj01.getThreadNameSynchronized ());
        System.out.println ();
    }
}
