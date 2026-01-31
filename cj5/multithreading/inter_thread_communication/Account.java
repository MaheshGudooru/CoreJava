package multithreading.inter_thread_communication;

public class Account implements Runnable {

    int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " has successfully deposited " + amount + " rupees!!");
        System.out.println("Thread " + Thread.currentThread().getName() + " has notified!!");
        notifyAll();
    }

    public synchronized void withdraw(int amount) {

        if (balance < amount) {
            try {
                System.out.println("waiting for deposit...");
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting");
                wait();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + "has successfully deduced " + amount + " rupees");
        System.out.println("Thread " + Thread.currentThread().getName() + " has completed execution");

    }

    @Override
    public void run() {
        while (Thread.currentThread().isAlive()) {
            System.out.println(Thread.currentThread().getName() + " started running...");
        }

        System.out.println(Thread.currentThread().getName() + " stopped!!!");
    }

    static void main() throws InterruptedException {

        Account a01 = new Account();

        Thread t1 = new Thread(() -> a01.withdraw(3000));
        t1.setName("withdraw_thread");
        Thread t2 = new Thread(() -> a01.deposit(10000));
        t2.setName("deposit_thread");


        t1.start();
//        t1.join();  // This will cause
        t2.start();

        t1.join();
        t2.join();

        System.out.println("current balance is: " + a01.balance);

    }


}
