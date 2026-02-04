package multithreading.executorservice;

import java.util.concurrent.*;

// ExecutorService is used to limit the number of threads running and rather than creating new threads for each new task we reuse the already created threads

public class ExecutorClass {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executorService = Executors.newFixedThreadPool (1); // only one threads is created and that thread is assigned with tasks, essentially thread reusing

        // thread01
        executorService.submit (new Runnable () { // submit
            @Override
            public void run() {
                try {
                    Thread.sleep (1000);
                } catch (InterruptedException e) {
                    System.err.println (e);
                }
                System.out.println ("The task-01 is executed by " + Thread.currentThread ().getName ());
            }
        });
        // thread02
        executorService.submit (new Runnable () { // Runnable cannot return any value and does not throw checked exception
            @Override
            public void run() {
                try {
                    Thread.sleep (1000);
                } catch (InterruptedException e) {
                    System.err.println (e);
                }
                System.out.println ("The task-02 is executed by " + Thread.currentThread ().getName ());
            }
        });
        // thread03
        Future<String> future = executorService.submit ( // Future represents the result that will be returned if the task is executed basically a type of placeholder for future result

                new Callable<String> () { // Callable can return values and throw checked exceptions
                    @Override
                    public String call() throws Exception {
                        try {
                            Thread.sleep (2000);
                        } catch (InterruptedException e) {
                            System.err.println (e);
                        }
                        System.out.println ("The task-03 is executed by " + Thread.currentThread ().getName ());
                        return "This is the result of the task";
                    }

                });

        if(future.isDone ()) { // checks if task is completed or failed
            System.out.println ("Callable Task-3 has been completed successfully..");
        }


        executorService.shutdown (); // stops the executor from accepting new tasks and waits for the finishing of already submitted tasks

        System.out.println (future.get ()); // get() is a blocking operation it blocks the calling thread throws multiple types of exceptions
        future.get (2, TimeUnit.SECONDS); // wait for specified amount of time and if result is available retrieve it

    }
}
