package concurrency;

import java.time.Instant;
import java.util.concurrent.CountDownLatch;

public class WorkerWithCountDownLatch extends Thread {
    private CountDownLatch latch;
    private Runnable func;

    public WorkerWithCountDownLatch(String name, CountDownLatch latch, Runnable func) {
        this.latch = latch;
        this.func = func;
        setName(name);
    }

    @Override
    public void run() {
        try {
            System.out.printf("[ %s ] created, blocked by the latch...\n", getName());
            latch.await();
            System.out.printf("[ %s ] starts at: %s\n", getName(), Instant.now());
            // do actual work here...
            func.run();
        } catch (InterruptedException e) {
            // handle exception
        }
    }
}